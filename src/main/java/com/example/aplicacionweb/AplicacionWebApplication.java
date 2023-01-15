package com.example.aplicacionweb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

@RestController
public class AplicacionWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AplicacionWebApplication.class, args);
	}



    @GetMapping("/api/v1/empleados")
	public Empleado personal(){


		Empleado instancia =new Empleado("Arturo","Devops");
		Empleado otra =new Empleado("Peter","Programador");
		Empleado ultimo =new Empleado("Pedro","Programador");
		Empleado nuevo =new Empleado("Carlos","DevOps");



        return instancia;

	}



}
