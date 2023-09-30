package gov.br.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ServidorEfetivo {
    @Id
    @Column(name = "pes_id")
    private Integer pesId;

    @Column(name = "se_matricula")
    private String matricula;

}
