package DIO.PizzariaDesingPatterns.service.imp;

import DIO.PizzariaDesingPatterns.model.Cliente;
import DIO.PizzariaDesingPatterns.model.ClienteRepository;
import DIO.PizzariaDesingPatterns.model.Endereco;
import DIO.PizzariaDesingPatterns.service.ClienteService;
import DIO.PizzariaDesingPatterns.service.EnderecoService;
import DIO.PizzariaDesingPatterns.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImp implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private ViaCepService viaCepService;
    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente bucarPorId(String id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente insert(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoService.findById(cep).orElseGet(()-> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoService.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
        return null;
    }
}
