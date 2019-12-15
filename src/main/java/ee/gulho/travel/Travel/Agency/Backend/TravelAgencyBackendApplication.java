package ee.gulho.travel.Travel.Agency.Backend;

import ee.gulho.travel.Travel.Agency.Backend.config.StorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class TravelAgencyBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelAgencyBackendApplication.class, args);
	}

}
