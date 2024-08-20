package DIO.PizzariaDesingPatterns.service;

import DIO.PizzariaDesingPatterns.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente bucarPorId(String id);

    Cliente insert(Cliente client);
}
