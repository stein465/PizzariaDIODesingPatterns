package DIO.PizzariaDesingPatterns.controller;


import DIO.PizzariaDesingPatterns.model.Pedido;
import DIO.PizzariaDesingPatterns.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pedidos")
public class PedidoRestController {
    @Autowired
    PedidoService pedidoService;


    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPorId(@RequestBody Long id){
        return ResponseEntity.ok(pedidoService.getPedidoById(id).get());
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<Pedido> getPorClient(@RequestBody Long clientId){
        return ResponseEntity.ok(pedidoService.getPedidoByCliente(clientId).get());
    }

    @PostMapping("/{Pedido}")
    public ResponseEntity<Pedido> fazerPegido(@RequestBody Pedido pedido){

        return ResponseEntity.ok(pedidoService.fazerPedido(pedido));
    }
}
