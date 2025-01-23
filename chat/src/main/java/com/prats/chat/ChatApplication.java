package com.prats.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
		System.err.println("Chat app using SpringBoot - WebSocket is up and running!!!!! 💬 ✅");
	}

}
