package pe.edu.idat.controladores;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.entidades.Cliente;
import pe.edu.idat.servicios.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteService servicio;
    
    @GetMapping
    public List<Cliente> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Cliente> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public Cliente add(@RequestBody Cliente cliente){
        return servicio.add(cliente);
    }
    
    @PutMapping("/{id}")
    public Cliente update(@PathVariable long id, @RequestBody Cliente cliente){
        cliente.setCodigo(id);
        return servicio.update(cliente);
    }
    
    @DeleteMapping("/{id}")
    public Cliente delete(@PathVariable long id){
        Cliente cliente = new Cliente();
        cliente.setEstado(false);
        return servicio.delete(Cliente.builder().codigo(id).build());
    }
}
