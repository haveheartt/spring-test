package gov.br.backend.entities;

import jakarta.persistence.*;

@Entity
public class Endereco {
    @Id
    @Column(name = "end_id")
    private Integer id;

    @Column(name = "end_tipo_logradouro")
    private String  tipoLogradouro;

    @Column(name = "end_logradouro")
    private String logradouro;

    @Column(name = "end_bairro")
    private String bairro;

    @Column(name = "end_numero")
    private String numero;

    @ManyToOne
    @JoinColumn(name = "cid_id")
    private Cidade cidade ;

    public Endereco() {
    }
}
