package in.sachinkr.sanschool.mapper;

import in.sachinkr.sanschool.model.Holiday;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HolidayMapper implements RowMapper<Holiday> {

    @Override
    public Holiday mapRow(ResultSet rs, int rowNum) throws SQLException {
        Holiday hl = new Holiday();
        hl.setDay(rs.getString("day"));
        hl.setType(Holiday.Type.valueOf(rs.getString("type")));
        hl.setReason(rs.getString("reason"));
        hl.setCreatedAt(rs.getTimestamp("created_at").toLocalDateTime());
        hl.setCreatedBy(rs.getString("created_by"));
        if(rs.getTimestamp("updated_at")!=null){
            hl.setUpdatedAt(rs.getTimestamp("updated_at").toLocalDateTime());
        }
        hl.setUpdatedBy(rs.getString("updated_by"));
        return hl;
    }
}
