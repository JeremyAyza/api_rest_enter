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
import pe.edu.idat.entidades.Producto;
import pe.edu.idat.servicios.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
 
    @Autowired
    private ProductoService servicio;
    
    @GetMapping
    public List<Producto> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Producto> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public Producto add(@RequestBody Producto producto){
        return servicio.add(producto);
    }
    
    @PutMapping("/{id}")
    public Producto update(@PathVariable long id, @RequestBody Producto producto){
        producto.setCodigo(id);
        return servicio.update(producto);
    }
    
    @DeleteMapping("/{id}")
    public Producto delete(@PathVariable long id){
        Producto producto = new Producto();
        producto.setEstado(false);
        return servicio.delete(Producto.builder().codigo(id).build());
    }
}
