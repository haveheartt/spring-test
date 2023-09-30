package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ServidorTemporario {
    @Id
    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pesId;

    @Column(name = "st_data_admissao")
    private Date dataAdmissao;

    @Column(name = "st_data_demissao")
    private String dataDemissao;
}
