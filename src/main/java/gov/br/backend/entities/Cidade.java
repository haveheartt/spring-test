package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cidade {
    @Id
    @Column(name = "cid_id")
    private Integer id;

    @Column(name = "cid_nome")
    private String nome;

    @Column(name = "cid_uf")
    private String uf;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "cid_id")
    private List<Endereco> enderecoList;

}
