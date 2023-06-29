package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;


@Entity
@Table(name = "libri")
@Getter
@Setter
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long idLibro;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "categoria", nullable = false)
    private String categoria;

    @Column(name = "data_pubblicazione", nullable = false)
    private LocalDateTime dataPubblicazione;

    @ManyToMany(mappedBy = "libriScritti") // mappato dalla lista libriScritti in Autore
    private List<Autore> listaAutori = new LinkedList<>();

    //@OneToMany(mappedBy = "libro")
    //private List<Prestito> prestiti = new LinkedList<>();

    public Libro() {
    }

    public Libro(String titolo,
                 String categoria,
                 LocalDateTime dataPubblicazione) {
        this.titolo = titolo;
        this.categoria = categoria;
        this.dataPubblicazione = dataPubblicazione;
    }

    @Override
    public String toString() {
        return "Libro [id=" + idLibro + ", titolo=" + titolo +
                ", categoria=" + categoria +
                ", data_pubblicazione=" + dataPubblicazione
                + "]";
    }
}