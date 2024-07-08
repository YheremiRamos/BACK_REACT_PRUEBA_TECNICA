package com.futbolista;

import org.jfree.util.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FutbolistaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FutbolistaApiApplication.class, args);
		Log.info("Carga completa, sigamos trabajando!!");
	}

}
