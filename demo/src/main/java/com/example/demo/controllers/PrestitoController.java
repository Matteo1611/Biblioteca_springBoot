package com.example.demo.controllers;

import com.example.demo.entities.Autore;
import com.example.demo.entities.Prestito;
import com.example.demo.DTO.PrestitoInputDTO;
import com.example.demo.services.PrestitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prestiti")
public class PrestitoController {

    @Autowired
    private PrestitoService prestitoServ;


    // Read
    @GetMapping("/getAll")
    public List<Prestito> getAllAutori(){
        return prestitoServ.getAllPrestiti();
    }

    @GetMapping("/searchPrestito")
    public Prestito getAutoreById(@RequestParam(value = "id_ricerca", defaultValue = "Nothing Was Found") int id_ricerca) {
        return prestitoServ.getPrestitoById(id_ricerca);
    }


    @PostMapping("/post")
    public Prestito createPrestito(@RequestBody PrestitoInputDTO prestitoInputDTO){
        return prestitoServ.createPrestito(prestitoInputDTO);
    }

    @PutMapping("/{id}")
    public Prestito updateAutore(@PathVariable("id") int id, @RequestBody Prestito prestito) {
        return prestitoServ.updatePrestito(id, prestito);
    }


    @DeleteMapping("/{id}")
    public void getById(@PathVariable("id") int id) {
        prestitoServ.deletePrestito(id);
    }


}
