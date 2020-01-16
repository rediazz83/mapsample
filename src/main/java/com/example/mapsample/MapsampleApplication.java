package com.example.mapsample;

import com.example.mapsample.domain.Persona;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;

@SpringBootApplication
public class MapsampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MapsampleApplication.class, args);
	}

	@Override
	public void run(String... args) {
		//crear un HashMap con clave mutable
		HashMap<Persona, String> map = new HashMap<>();

		//crear llave 1
		Persona llave1 = new Persona(1, "Rodrigo", "Diaz", "Zuniga", "@ior");

		//crear llave 2
		Persona llave2 = new Persona(2, "Maria", "Carvajal", "Cortes", "@eme");

		//Poner clave mutable y valor en el mapa
		map.put(llave1, llave1.obtenerNombreCompleto());
		map.put(llave2, llave2.obtenerNombreCompleto());

		//cambie el estado de las claves para que el mapa hash se vuelva a calcular
		llave1.setApodoSlack("@rodri");
		llave2.setApodoSlack("@maria");

		//aca deberíamos poder recuperar los valores
		System.out.println(map.get(llave1)); //imprime Rodrigo Diaz Zuniga @ior
		System.out.println(map.get(llave2)); //imprime Maria Carvajal Cortes @eme

		//probamos creando una nueva persona reutilizando el id de Rodrigo
		Persona persona = new Persona(1,"Jose", "Valenzuela", "Salvo", "@jocheto");

		//el registro debería seguir inmutable
		System.out.println(map.get(persona)); //imprime Rodrigo Diaz Zuniga @ior
	}
}
