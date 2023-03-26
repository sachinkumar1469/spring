package in.sachinkr.sanschool.model;


import in.sachinkr.sanschool.annotations.FieldValueMatch;
import in.sachinkr.sanschool.annotations.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
@Table(name = "person")
@FieldValueMatch.List({
        @FieldValueMatch(field = "pwd", fieldMatch = "confirmPwd", message = "Password Mismatch."),
        @FieldValueMatch(field = "email", fieldMatch = "confirmEmail", message = "Email Mismatch.")
})
public class Person extends BaseEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int personId;

    @NotBlank(message = "Name can't be blank")
    @Size(min = 3, message = "Name must be atleast three characters long.")
    private String name;

    @NotBlank(message = "Mobile number must not be blank.")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "Mobile number must be of ten digits.")
    private String mobileNumber;


    @NotBlank(message = "Email must not be blank")
    @Email(message = "Email address is not valid")
    private String email;

    @NotBlank(message = "Confirm Email Must Not be Blank.")
    @Email(message = "Confirm Email is not a valid mailId")
    @Transient
    private String confirmEmail;


    @NotBlank(message = "Password can't be blank")
    @Size(min = 5,message = "Password must be atleast 5 character long.")
    @PasswordValidator
    private String pwd;

    @NotBlank(message = "Password can't be blank")
    @Size(min = 5,message = "Confrim Password must be atleast 5 character long.")
    @Transient
    private String confirmPwd;

    @OneToOne(cascade = {CascadeType.PERSIST},fetch = FetchType.EAGER,targetEntity = Roles.class)
    @JoinColumn(name = "role_id",referencedColumnName = "roleId",nullable = false)
    Roles roles;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER,targetEntity = Address.class)
    @JoinColumn(name = "address_id",nullable = true,referencedColumnName = "addressId")
    Address address;

}
