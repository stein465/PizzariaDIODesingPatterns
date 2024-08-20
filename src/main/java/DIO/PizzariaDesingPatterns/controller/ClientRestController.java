package DIO.PizzariaDesingPatterns.controller;


import DIO.PizzariaDesingPatterns.model.Cliente;
import DIO.PizzariaDesingPatterns.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
public class ClientRestController {
    @Autowired
    ClienteService clienteService;

    @GetMapping
    public ResponseEntity<Iterable<Cliente>> getTodos(){
         return ResponseEntity.ok(clienteService.buscarTodos());
     }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getPorId(@RequestBody String id){
        return ResponseEntity.ok(clienteService.bucarPorId(id));
    }

    @PostMapping()
    public ResponseEntity<Cliente> criarCliente(@RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.insert(cliente));
    }
}
