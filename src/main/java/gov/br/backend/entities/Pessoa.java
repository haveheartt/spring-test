package gov.br.backend.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Pessoa {
    @Id
    @Column(name = "pes_id")
    private Integer id;

    @Column(name = "pes_nome")
    private String nome;

    @Column(name = "pes_data_nascimento")
    private Date dataNascimento;

    @Column(name = "pes_sexo")
    private String sexo;

    @Column(name = "pes_mae")
    private String mae;

    @Column(name = "pes_pai")
    private String pai;

    @ManyToMany
    @JoinTable(
            name = "pessoa_endereco",
            joinColumns = { @JoinColumn(name = "pes_id") },
            inverseJoinColumns = { @JoinColumn(name = "end_id") }
    )
    private List<Endereco> enderecoList;

    @OneToMany
    @JoinColumn(name = "pes_id")
    private List<FotoPessoa> fotoList;

    @OneToMany
    @JoinColumn(name = "pes_id")
    private List<ServidorTemporario> servidorTemporarioList;

    @OneToMany
    @JoinColumn(name = "pes_id")
    private List<ServidorEfetivo> servidorEfetivoList;

    @OneToMany
    @JoinColumn(name = "pes_id")
    private List<Lotacao> lotacaoList;

}
