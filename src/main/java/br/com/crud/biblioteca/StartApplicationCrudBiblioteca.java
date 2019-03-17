package br.com.crud.biblioteca;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplicationCrudBiblioteca implements CommandLineRunner {
    public static void main( String[] args ) {
        SpringApplication.run(StartApplicationCrudBiblioteca.class, args);
    }

	public void run(String... args) throws Exception {
		Date date = new Date();
		System.out.println(date + "  -> Application is Up! <-");
		
	}
}
