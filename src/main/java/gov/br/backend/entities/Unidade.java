package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Unidade {
    @Id
    @Column(name = "unid_id")
    private Integer unidId;

    @Column(name = "unid_nome")
    private String nome;

    @Column(name = "unid_sigla")
    private String sigla;

    @OneToMany
    @JoinColumn(name = "unid_id")
    private List<Lotacao> lotacaoList;

    @ManyToMany
    @JoinTable(
            name = "unidade_endereco",
            joinColumns = { @JoinColumn(name = "unid_id") },
            inverseJoinColumns = { @JoinColumn(name = "end_id") }
    )
    private List<Endereco> enderecoList;

}
