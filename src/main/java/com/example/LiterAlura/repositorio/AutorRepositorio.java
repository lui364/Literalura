package com.example.LiterAlura.repositorio;

import com.example.LiterAlura.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepositorio extends JpaRepository<Autor, Long> {
}
