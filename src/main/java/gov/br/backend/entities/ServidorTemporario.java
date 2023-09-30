package gov.br.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class ServidorTemporario {
    @Id
    @Column(name = "pes_id")
    private Integer pesId;

    @Column(name = "st_data_admissao")
    private Date dataAdmissao;

    @Column(name = "st_data_demissao")
    private String dataDemissao;
}
