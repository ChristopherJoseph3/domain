package domain.controller;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import domain.service.DomainService;

@Controller
public class DomainController extends HttpServlet {

	@Autowired
	private DomainService domainService;

	@GetMapping("/domain")
	public String getTopThreeDomainReferral(HttpServletRequest request) {
		request.setAttribute("domainReferral", domainService.getTopThreeDomainReferral());
		return "index";
	}

	@GetMapping("/validate")
	public String addDomainReferral(HttpServletRequest request) throws MalformedURLException, InvalidInputException {
		String userURL = (String) request.getParameter("userURL");
		request.setAttribute("domainReferral", domainService.addDomainReferral(userURL));
		return "index";
	}

}
