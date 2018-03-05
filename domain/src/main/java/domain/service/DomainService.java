package domain.service;

import java.net.MalformedURLException;
import java.util.List;

import org.eclipse.jdt.core.compiler.InvalidInputException;

import domain.model.Domain;

public interface DomainService {
	public List<Domain> getTopThreeDomainReferral();

	public List<Domain> addDomainReferral(String newURL) throws MalformedURLException, InvalidInputException;
}
