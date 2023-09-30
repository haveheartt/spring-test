package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Lotacao {
    @Id
    @Column(name = "lot_id")
    private Integer lotId;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pesId;

    @ManyToOne
    @JoinColumn(name = "unid_id")
    private Unidade unidId;

    @Column(name = "lot_data_lotacao")
    private Date dataLotacao;

    @Column(name = "lot_data_remocao")
    private Date dataRemocao;

    @Column(name = "lot_portaria")
    private String portaria;

}
