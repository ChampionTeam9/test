package sg.edu.nus.goldlake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GoldLakeApplication {

	public static void main(String[] args) {
		System.out.println("Starting");
		SpringApplication.run(GoldLakeApplication.class, args);
	}

}
