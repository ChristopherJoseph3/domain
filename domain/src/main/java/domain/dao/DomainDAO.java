package domain.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import domain.model.Domain;

@Repository
public interface DomainDAO {
	public List<Domain> getAllDomainReferral();
	public Domain getDomainReferral(String domainName);
	public void addDomainReferral(String domainName, Integer referralCount);
	public void updateDomainReferral(Domain domainName);
}
