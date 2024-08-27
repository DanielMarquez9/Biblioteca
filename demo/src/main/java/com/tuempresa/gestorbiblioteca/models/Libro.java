package com.tuempresa.gestorbiblioteca.models;

import lombok.Data;

@Data
public class Libro {
    private String titulo;
    private String autor;
    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}