package domain.util;

import java.net.MalformedURLException;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.jdt.core.compiler.InvalidInputException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlingController {
	@ExceptionHandler(MalformedURLException.class)
	public String handleMalformedURLException(MalformedURLException ex, HttpServletRequest request) {
		request.setAttribute("errorMessage", "MalformedURLException");
		return "errorview";
	}

	@ExceptionHandler(InvalidInputException.class)
	public String handleInvalidInputException(InvalidInputException ex) {
		return "errorview";
	}

	@ExceptionHandler(Exception.class)
	public String handleException(Exception ex) {
		return "errorview";
	}
}
