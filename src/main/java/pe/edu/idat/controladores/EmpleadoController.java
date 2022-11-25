
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
import pe.edu.idat.entidades.Empleado;
import pe.edu.idat.servicios.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {
    
    @Autowired
    private EmpleadoService servicio;
    
    @GetMapping
    public List<Empleado> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<Empleado> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<Empleado> findById(@PathVariable Long id){
        return servicio.findById(id);
    }
    
    @PostMapping
    public Empleado add(@RequestBody Empleado empleado){
        return servicio.add(empleado);
    }
    
    @PutMapping("/{id}")
    public Empleado update(@PathVariable long id, @RequestBody Empleado empleado){
        empleado.setCodigo(id);
        return servicio.update(empleado);
    }
    
    @DeleteMapping("/{id}")
    public Empleado delete(@PathVariable long id){
        Empleado empleado = new Empleado();
        empleado.setEstado(false);
        return servicio.delete(Empleado.builder().codigo(id).build());
    }
    
}
