package fvclaus.springdatapostgresstoredprocedurebug;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

@SpringBootTest
class SpringDataPostgresStoredProcedureBugApplicationTests {

	static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>(
		"postgres:12-alpine"
	  );

	@Autowired
	private SomeRepository someRepository;

	@BeforeAll
	public static void beforeAll() {
		postgres.start();
	}

	@DynamicPropertySource
  static void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.datasource.url", postgres::getJdbcUrl);
    registry.add("spring.datasource.username", postgres::getUsername);
    registry.add("spring.datasource.password", postgres::getPassword);
  }

	@Test
	@Transactional
	void callProcedure() {
		someRepository.someProcedure("1");
	}

}
