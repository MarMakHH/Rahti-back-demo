package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.domain.Message;
import com.example.demo.domain.MessageRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Bean
    public CommandLineRunner demo(MessageRepository repo) {
        return (args) -> {
            if (repo.count() == 0) {
                Message msg1 = new Message("Test 1");
                Message msg2 = new Message("Test 2");
                Message msg3 = new Message("Test 3");
                Message msg4 = new Message("Test 4");
                Message msg5 = new Message("Test 5");
                repo.save(msg1);
                repo.save(msg2);
                repo.save(msg3);
                repo.save(msg4);
                repo.save(msg5);
            }
        };
    }
}
