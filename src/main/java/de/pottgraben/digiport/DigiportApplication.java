package de.pottgraben.digiport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DigiportApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigiportApplication.class, args);
	}

	@GetMapping("/")
    public String home() {
      return "index"; // This will serve the index.html file
  }
}
