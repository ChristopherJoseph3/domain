package domain.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import domain.model.Domain;

public class DomainRowMapper implements RowMapper<Domain>
{
    @Override
	public Domain mapRow(ResultSet rs, int rowNum) throws SQLException {
        Domain domain = new Domain();
        domain.setDomainName(rs.getString("domainName"));
        domain.setReferralCount(rs.getInt("referralCount"));
        return domain;
    }
}
