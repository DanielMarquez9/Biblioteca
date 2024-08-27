package com.tuempresa.gestorbiblioteca.services;

import com.tuempresa.gestorbiblioteca.models.Libro;

public interface BibliotecaService {
    void agregarLibro(Libro libro);
    void prestarLibro(String titulo);
}