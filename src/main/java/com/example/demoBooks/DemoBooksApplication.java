package com.example.demoBooks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBooksApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner (BookRepository bookRepository){
		return args -> {
			Book book1=new Book("Book about me",
					"K.M Madalinska",
					"book_about_me@wp.pl",
					2);
			bookRepository.save(book1);
		};
	}

}
