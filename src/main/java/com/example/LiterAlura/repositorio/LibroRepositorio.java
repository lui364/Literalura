package com.example.LiterAlura.repositorio;

import com.example.LiterAlura.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepositorio extends JpaRepository<Libro, Long> {
}
