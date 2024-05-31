package com.example.LiterAlura.services;

import com.example.LiterAlura.entidades.Libro;
import com.example.LiterAlura.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class LibroServicio {
    @Autowired
    private LibroRepositorio libroRepositorio;

    public List<Libro> obtenerTodosLosLibros() {
        return libroRepositorio.findAll();
    }
}
