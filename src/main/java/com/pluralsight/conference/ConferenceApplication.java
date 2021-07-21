package com.pluralsight.conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceApplication extends SpringBootServletInitializer {
	/*extends SpringBoot... tells the application server to go ahead and create a dispatcher servlet and start
	serving up things | as part of that it starts looking for annotations like @Controller, @GetMapping, etc */

	public static void main(String[] args) {
		SpringApplication.run(ConferenceApplication.class, args);
	}

}
