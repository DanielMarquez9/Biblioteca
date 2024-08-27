package com.tuempresa.gestorbiblioteca.services;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tuempresa.gestorbiblioteca.models.Libro;

@Service
public class BibliotecaServiceImpl implements BibliotecaService {
    
    private static final Logger logger = LoggerFactory.getLogger(BibliotecaServiceImpl.class);

    @Override
    public void agregarLibro(Libro libro) {
        logger.info("Libro agregado: " + libro.getTitulo() + " de " + libro.getAutor());
    }

    @Override
    public void prestarLibro(String titulo) {
        logger.info("Libro prestado: " + titulo);
    }
}