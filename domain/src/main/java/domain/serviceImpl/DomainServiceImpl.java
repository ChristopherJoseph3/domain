package domain.serviceImpl;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.net.InternetDomainName;

import domain.dao.DomainDAO;
import domain.model.Domain;
import domain.service.DomainService;

@Service
public class DomainServiceImpl implements DomainService {

	@Autowired
	private DomainDAO domainDAO;

	private static final long topListCount = 3;

	public List<Domain> getTopThreeDomainReferral() {
		return getTopThreeDomainReferrals(domainDAO.getAllDomainReferral());
	}

	private List<Domain> getTopThreeDomainReferrals(List<Domain> domainReferral) {
		return domainReferral.stream().sorted((d1, d2) -> d2.getReferralCount().compareTo(d1.getReferralCount()))
				.limit(topListCount).collect(Collectors.toList());
	}

	public List<Domain> addDomainReferral(String userURL) throws MalformedURLException, InvalidInputException {
		try {
			// Create the URL object from the entered URL
			URL aURL = new URL(userURL);
			// Validate the domain name
			if (InternetDomainName.isValid(aURL.getHost())) {
				// Get the Domain name from the newly created URL Object
				String domainName = InternetDomainName.from(aURL.getHost()).topPrivateDomain().name();
				// Check if domain is already present in DB
				Domain domain = domainDAO.getDomainReferral(domainName);
				// If not present add the domain else update the domain
				if (null == domain) {
					domainDAO.addDomainReferral(domainName, 1);
				} else {
					domain.setReferralCount(domain.getReferralCount() + 1);
					domainDAO.updateDomainReferral(domain);
				}
			} else
				throw new InvalidInputException();
		} catch (MalformedURLException e) {
			throw e;
		}

		return getTopThreeDomainReferrals(domainDAO.getAllDomainReferral());
	}

	// public static String getUrlDomainName(String userURL) {
	// String domainName = new String(userURL);
	// int index = domainName.indexOf("://");
	//
	// if (index != -1) {
	// // keep everything after "://"
	// domainName = domainName.substring(index + 3);
	// }
	// index = domainName.indexOf('/');
	//
	// if (index != -1) {
	// // keep everything before "/"
	// domainName = domainName.substring(0, index);
	// }
	// // check for and remove a preceding 'www' followed by any sequence of
	// // characters (non greedy) followed by a '.' from the beginning of the
	// domainName = domainName.replaceFirst("^www.*?\\.", "");
	// return domainName;
	// }
}
