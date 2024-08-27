package com.tuempresa.gestorbiblioteca.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tuempresa.gestorbiblioteca.models.Libro;
import com.tuempresa.gestorbiblioteca.services.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {

    @Autowired
    private BibliotecaService bibliotecaService;

    @PostMapping("/agregar")
    public void agregarLibro(@RequestBody Libro libro) {
        bibliotecaService.agregarLibro(libro);
    }

    @PostMapping("/prestar/{titulo}")
    public void prestarLibro(@PathVariable String titulo) {
        bibliotecaService.prestarLibro(titulo);
    }
}