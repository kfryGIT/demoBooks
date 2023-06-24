package com.example.demoBooks;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//program obejmuje
//podlaczenie idea do bazy danych <pgAdmin> postgresSQL
//tworzenie encji, (2x) instancji klasy +automatyczne tworzenie tabeli z dwiema krotkami
//każde uruchomienie programu tworzy nowe krotki w tabeli;

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
			Book book2=new Book("TEST",
					"XYZ",
					"xyze@wp.pl",
					3);
			bookRepository.save(book2);
		};
	}

}
