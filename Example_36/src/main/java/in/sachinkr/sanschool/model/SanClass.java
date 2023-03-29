package in.sachinkr.sanschool.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "class")
@Data
public class SanClass extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @GenericGenerator(name = "native",strategy = "native")
    private int classId;

    @NotBlank(message = "Name can't be blank")
    @Size(min = 3,message = "Name must be atlease three character long.")
    private String name;

    @OneToMany(mappedBy = "sanClass",fetch = FetchType.LAZY,cascade = CascadeType.PERSIST,targetEntity = Person.class)
    private List<Person> persons;
}
