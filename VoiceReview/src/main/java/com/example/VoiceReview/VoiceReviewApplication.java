package com.example.VoiceReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VoiceReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(VoiceReviewApplication.class, args);
		User user=new User("hello","world");
		UserDB.users.add(user);
	}

}
