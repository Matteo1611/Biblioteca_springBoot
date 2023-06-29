package com.example.demo.entities;

//import com.example.demo.chiave.PrestitoId;

import com.example.demo.chiave.PrestitoId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "prestiti")
@IdClass(PrestitoId.class)
public class Prestito {

    @Id
    @Column(name="id_libro")
    private Long idLibro;

    @ManyToOne
    @JoinColumn(name = "id_libro", insertable = false,updatable = false)
    private Libro libro;

    @Id
    @Column(name="id_utente")
    private Long idUtente;

    @ManyToOne
    @JoinColumn(name = "id_utente", insertable = false,updatable = false)
    private Utente utente;

    @Id
    @Column(name = "timestamp_prestito_inizio")
    private LocalDateTime timestampPrestitoInizio;

    @Column(name = "timestamp_prestito_fine")
    private LocalDateTime timestampPrestitoFine;


}
