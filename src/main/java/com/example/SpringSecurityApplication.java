package com.example;

import com.example.client.RestClient;
import com.example.dto.UserDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		SpringApplication.run(SpringSecurityApplication.class, args);
		new RestClient().init(getDefaultUser());
	}

	private static UserDto getDefaultUser() {
		UserDto userDto = new UserDto();
		userDto.setId(1L);
		userDto.setFirstName("Alberto");
		userDto.setLastName("Rossi");
		userDto.setEmail("alberto@gmail.com");
		userDto.setPassword("test");
		userDto.setRole("admin");
		return userDto;
	}

}
