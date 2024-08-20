package DIO.PizzariaDesingPatterns.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Cliente cliente;

    @Enumerated(EnumType.STRING)
    private Sabor sabor;

}
