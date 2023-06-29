package com.example.demo.chiave;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class PrestitoId implements Serializable {

    private Long idLibro;
    private Long idUtente;
    private LocalDateTime timestampPrestitoInizio;

    public PrestitoId(Long idLibro, Long idUtente, LocalDateTime timestampPrestitoInizio) {
        this.idLibro = idLibro;
        this.idUtente = idUtente;
        this.timestampPrestitoInizio = timestampPrestitoInizio;
    }


}
