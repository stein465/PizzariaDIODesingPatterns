package DIO.PizzariaDesingPatterns.service;
import DIO.PizzariaDesingPatterns.model.Pedido;

import java.util.Optional;

public interface PedidoService {

    Optional<Pedido> getPedidoById(Long id);

    Optional<Pedido> getPedidoByCliente(Long clientId);
    Pedido fazerPedido(Pedido pedido);
}
