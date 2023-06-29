package com.example.demo.entities;

//import com.example.demo.chiave.PrestitoId;

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
public class Prestito {

    //    @EmbeddedId
//    private PrestitoId prestitoId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_prestito")
    private Long idPrestito;

    @OneToOne // cambia in onetoone
//    @MapsId("idLibro")
    @JoinColumn(name = "id_libro")
    private Libro libro;

    @OneToOne
//    @MapsId("idUtente")
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @Column(name = "timestamp_prestito_inizio")
    private LocalDateTime timestampPrestitoInizio;

    @Column(name = "timestamp_prestito_fine")
    private LocalDateTime timestampPrestitoFine;


}
