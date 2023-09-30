package gov.br.backend.entities;

import jakarta.persistence.*;

@Entity
public class ServidorEfetivo {
    @Id
    @ManyToOne
    @JoinColumn(name = "pes_id")
    private Pessoa pesId;

    @Column(name = "se_matricula")
    private String matricula;

}
