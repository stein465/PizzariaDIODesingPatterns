package DIO.PizzariaDesingPatterns.service.imp;

import DIO.PizzariaDesingPatterns.model.Endereco;
import DIO.PizzariaDesingPatterns.model.EnderecoRepository;
import DIO.PizzariaDesingPatterns.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoServiceImp implements EnderecoService {

        @Autowired
        EnderecoRepository enderecoRepository;

        @Override
        public Optional<Endereco> findById(String id) {
                return enderecoRepository.findById(id);
        }

        @Override
        public Endereco save(Endereco endereco) {
                return enderecoRepository.save(endereco);
        }
}
