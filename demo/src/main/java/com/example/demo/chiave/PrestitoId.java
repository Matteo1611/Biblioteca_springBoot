//package com.example.demo.chiave;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Embeddable;
//
//import java.io.Serializable;
//import java.time.LocalDateTime;
//
//@Embeddable
//public class PrestitoId implements Serializable {
//    @Column(name="id_libro")
//    private int idLibro;
//    @Column(name="id_utente")
//    private int idUtente;
//    @Column(name="timestamp_prestito_inizio")
//    private LocalDateTime timestampPrestitoInizio;
//
//    public PrestitoId(int idLibro, int idUtente, LocalDateTime timestampPrestitoInizio) {
//        this.idLibro = idLibro;
//        this.idUtente = idUtente;
//        this.timestampPrestitoInizio = timestampPrestitoInizio;
//    }
//
//    public int getIdLibro() {
//        return idLibro;
//    }
//
//    public void setIdLibro(int idLibro) {
//        this.idLibro = idLibro;
//    }
//
//    public int getIdUtente() {
//        return idUtente;
//    }
//
//    public void setIdUtente(int idUtente) {
//        this.idUtente = idUtente;
//    }
//
//    public LocalDateTime getDataPrestito() {
//        return timestampPrestitoInizio;
//    }
//
//}
