package com.example.demo.controllers;

import com.example.demo.entities.Libro;
import com.example.demo.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libri")
public class LibroController {
    @Autowired
    private LibroService libroServ;

    // Get
    @GetMapping("/getAll")
    public List<Libro> getAllLibri(){
        return libroServ.getAllLibri();
    }

    @GetMapping("/searchLibro")
    public Libro getLibroById(@RequestParam(value="id_ricerca", defaultValue = "Nothing was found") Long id_ricerca){
        return libroServ.getLibroById(id_ricerca);
    }

    // Post
    @PostMapping("/post")
    public Libro createLibro(@RequestBody Libro libro){
        return libroServ.createLibro(libro);
    }

    // Put
    @PutMapping("/{id}")
    public Libro updateLibro(@PathVariable("id") Long id, @RequestBody Libro libro) {
        return libroServ.updateLibro(id, libro);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void deleteAutore(@PathVariable("id") Long id) {
        libroServ.deleteLibro(id);
    }


}
