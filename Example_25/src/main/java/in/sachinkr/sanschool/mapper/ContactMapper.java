package in.sachinkr.sanschool.mapper;

import in.sachinkr.sanschool.model.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ContactMapper implements RowMapper<Contact> {
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
        Contact cn = new Contact();
        cn.setContactId(rs.getInt("contact_id"));
        cn.setName(rs.getString("name"));
        cn.setMobileNum(rs.getString("mobile_num"));
        cn.setEmail(rs.getString("email"));
        cn.setSubject(rs.getString("subject"));
        cn.setMessage(rs.getString("message"));
        cn.setStatus(rs.getString("status"));
        cn.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        cn.setCreatedBy(rs.getString("created_by"));

        if(null!=rs.getTimestamp("UPDATED_AT")){
            cn.setUpdatedAt(rs.getTimestamp("UPDATED_AT").toLocalDateTime());
        }
        cn.setUpdatedBy(rs.getString("UPDATED_BY"));
        return cn;
    }
}
