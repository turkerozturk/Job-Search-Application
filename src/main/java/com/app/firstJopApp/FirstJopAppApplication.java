package com.app.firstJopApp;

import dialect.DatabaseRuntimeHintsRegistrar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(DatabaseRuntimeHintsRegistrar.class)
public class FirstJopAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstJopAppApplication.class, args);
	} 

}
