package gov.br.backend.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Lotacao {
    @Id
    @Column(name = "lot_id")
    private Integer lotId;

    @Column(name = "pes_id")
    private Integer pesId;

    @Column(name = "unid_id")
    private Integer unidId;

    @Column(name = "lot_data_lotacao")
    private Date dataLotacao;

    @Column(name = "lot_data_remocao")
    private Date dataRemocao;

    @Column(name = "lot_portaria")
    private String portaria;

}
