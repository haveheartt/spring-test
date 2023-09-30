package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class FotoPessoa {
    @Id
    @Column(name = "fp_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pesId;

    @Column(name = "fp_data")
    private Date data;

    @Column(name = "fp_bucket")
    private String bucket;

    @Column(name = "fp_hash")
    private String hash;

}
