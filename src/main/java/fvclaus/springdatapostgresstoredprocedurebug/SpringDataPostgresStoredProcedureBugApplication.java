package fvclaus.springdatapostgresstoredprocedurebug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "fvclaus")
public class SpringDataPostgresStoredProcedureBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataPostgresStoredProcedureBugApplication.class, args);
	}

}
