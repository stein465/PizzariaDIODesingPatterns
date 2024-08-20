package DIO.PizzariaDesingPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PizzariaDesingPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzariaDesingPatternsApplication.class, args);
	}

}
