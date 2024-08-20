package DIO.PizzariaDesingPatterns.service.imp;

import DIO.PizzariaDesingPatterns.model.Pedido;
import DIO.PizzariaDesingPatterns.model.PedidoRepository;
import DIO.PizzariaDesingPatterns.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImp implements PedidoService {

        @Autowired
        PedidoRepository pedidoRepository;
        @Autowired
        PedidoService pedidoService;

        @Override
        public Optional<Pedido> getPedidoById(Long id) {
                return pedidoRepository.findById(id);
        }

        @Override
        public Optional<Pedido> getPedidoByCliente(Long clientId) {
                return pedidoRepository.findByClienteId(clientId);
        }

        @Override
        public Pedido fazerPedido(Pedido pedido) {
               return pedidoRepository.save(pedido);
        }
}
