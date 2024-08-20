package DIO.PizzariaDesingPatterns.service;


import DIO.PizzariaDesingPatterns.model.Endereco;

import java.util.Optional;

public interface EnderecoService {

        Optional<Endereco> findById(String id);

        Endereco save(Endereco endereco);
}
