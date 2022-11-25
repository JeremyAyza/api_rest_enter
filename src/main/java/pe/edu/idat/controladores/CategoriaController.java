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
import pe.edu.idat.entidades.Categoria;
import pe.edu.idat.servicios.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService servicio;
    
    @GetMapping
    public List<Categoria> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Categoria> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Categoria> findById(@PathVariable Long id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public Categoria add(@RequestBody Categoria categoria){
        return servicio.add(categoria);
    }
    
    @PutMapping("/{id}")
    public Categoria update(@PathVariable long id, @RequestBody Categoria categoria){
        categoria.setCodigo(id);
        return servicio.update(categoria);
    }
    
    @DeleteMapping("/{id}")
    public Categoria delete(@PathVariable long id){
        Categoria categoria = new Categoria();
        categoria.setEstado(false);
        return servicio.delete(Categoria.builder().codigo(id).build());
    }
}
