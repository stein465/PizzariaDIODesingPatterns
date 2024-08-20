package DIO.PizzariaDesingPatterns.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    @ManyToOne
    private Endereco endereco;
}
