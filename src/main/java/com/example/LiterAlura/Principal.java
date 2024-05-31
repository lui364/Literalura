package com.example.LiterAlura;

import com.example.LiterAlura.entidades.Libro;
import com.example.LiterAlura.services.LibroServicio;
import com.example.LiterAlura.services.consumirApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		SpringApplication.run(Libro.class, args);
	}
}

@Component
class AppRunner implements CommandLineRunner {


	private consumirApi gutendexClient;

	@Autowired
	private LibroServicio libroServicio;

	@Override
	public void run(String... args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Menú:");
			System.out.println("1. Buscar libro por título");
			System.out.println("2. Listar libros registrados");
			System.out.println("3. Listar autores registrados");
			System.out.println("4. Listar autores vivos en un año específico");
			System.out.println("5. Listar libros por idioma");
			System.out.println("6. Salir");
			System.out.print("Elija una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine();  // Consumir nueva línea

			try {
				switch (opcion) {
					case 1:
						System.out.print("Ingrese el título del libro: ");
						String titulo = scanner.nextLine();
						String resultado = gutendexClient.buscarLibrosPorTitulo(titulo);
						System.out.println(resultado);
						// Guardar libros en la base de datos
						break;
					case 2:
						// Listar libros registrados
						break;
					case 3:
						// Listar autores registrados
						break;
					case 4:
						System.out.print("Ingrese el año: ");
						int year = scanner.nextInt();
						// Listar autores vivos en ese año
						break;
					case 5:
						System.out.print("Ingrese el idioma: ");
						String idioma = scanner.nextLine();
						// Listar libros por idioma
						break;
					case 6:
						System.exit(0);
					default:
						System.out.println("Opción inválida. Intente de nuevo.");
				}
			} catch (IOException | InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
