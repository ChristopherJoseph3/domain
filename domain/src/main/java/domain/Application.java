package domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ExceptionHandler;

import domain.util.ExceptionHandlingController;

@SpringBootApplication
@ComponentScan(basePackages=("domain.*"))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}

}
