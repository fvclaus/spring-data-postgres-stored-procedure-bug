package fvclaus.springdatapostgresstoredprocedurebug;

import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringDataPostgresStoredProcedureBugApplication {

	// Doesn't work with Spring Boot 3.0 and does not seem to be required anyway
	// public static void main(String[] args) {
	// 	SpringApplication.from(SpringDataPostgresStoredProcedureBugApplication::main).with(TestSpringDataPostgresStoredProcedureBugApplication.class).run(args);
	// }

}
