package in.sachinkr.sanschool.repository;

import in.sachinkr.sanschool.constants.SanSchoolConstants;
import in.sachinkr.sanschool.mapper.ContactMapper;
import in.sachinkr.sanschool.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

/*
    @Repository stereotype annotation is used to add a bean of this class
    type to the Spring context and indicate that given Bean is used to perform
    DB related operations
*/
@Repository
public class ContactRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ContactRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    // Create a new contact message in the database
    public int saveContactMsg(Contact contact){
        String sql = "INSERT INTO contact_msg (name,mobile_num,email,subject,message,status," +
                "created_at,created_by) VALUES (?,?,?,?,?,?,?,?)";
        return jdbcTemplate.update(sql,contact.getName(),contact.getMobileNum(),
                contact.getEmail(),contact.getSubject(),contact.getMessage(),
                contact.getStatus(),contact.getCreatedAt(),contact.getCreatedBy());
    }


    // Get all the messages from the database
    public List<Contact> findMsgsWithStatus(String status) {

            String sql = "SELECT * FROM contact_msg WHERE status = ?";
            return jdbcTemplate.query(sql, new PreparedStatementSetter() {
                @Override
                public void setValues(PreparedStatement ps) throws SQLException {
                    ps.setString(1,status);
                }
            },new ContactMapper());

    }


    public int changeStatusById(int id, String status,String name) {
        String sql = "UPDATE contact_msg SET status = ?, updated_by = ?, updated_at = ? WHERE contact_id = ? ";
        return jdbcTemplate.update(sql, new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1,status);
                ps.setString(2,name);
                ps.setTimestamp(3, Timestamp.valueOf(LocalDateTime.now()));
                ps.setInt(4,id);
            }
        });
    }
}
