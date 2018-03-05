package domain.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import domain.dao.DomainDAO;
import domain.model.Domain;

@Repository
public class DomainDAOImpl implements DomainDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional(readOnly = true)
	public List<Domain> getAllDomainReferral() {
		return jdbcTemplate.query("select * from DOMAIN", new DomainRowMapper());
	}

	@Transactional(readOnly = true)
	public Domain getDomainReferral(String domainName) {
		try {
			return jdbcTemplate.queryForObject("select * from DOMAIN where DOMAINNAME=?", new Object[] { domainName },
					new DomainRowMapper());
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Transactional(readOnly = false)
	public void addDomainReferral(String domainName, Integer referralCount) {
		jdbcTemplate.update("insert into DOMAIN(DOMAINNAME,REFERRALCOUNT) values (?,?)", domainName, referralCount);
	}

	@Transactional(readOnly = false)
	public void updateDomainReferral(Domain domain) {
		jdbcTemplate.update("update DOMAIN set REFERRALCOUNT=? where DOMAINNAME=?", domain.getReferralCount(),
				domain.getDomainName());
	}
}