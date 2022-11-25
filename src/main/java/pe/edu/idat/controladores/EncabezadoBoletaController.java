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
import pe.edu.idat.entidades.EncabezadoBoleta;
import pe.edu.idat.servicios.EncabezadoBoletaService;

@RestController
@RequestMapping("/encabezado-boleta")
public class EncabezadoBoletaController {
    
    @Autowired
    private EncabezadoBoletaService servicio;
    
    @GetMapping
    public List<EncabezadoBoleta> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<EncabezadoBoleta> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @GetMapping("/{id}")
    public Optional<EncabezadoBoleta> findById(@PathVariable String id){
        
        return servicio.findById(id);
    }
    
    @PostMapping
    public EncabezadoBoleta add(@RequestBody EncabezadoBoleta encabezadoBoleta){
        return servicio.add(encabezadoBoleta);
    }
    
    @PutMapping("/{id}")
    public EncabezadoBoleta update(@PathVariable String id, @RequestBody EncabezadoBoleta encabezadoBoleta){
        encabezadoBoleta.setCodigo(id);
        return servicio.update(encabezadoBoleta);
    }
    
    @DeleteMapping("/{id}")
    public EncabezadoBoleta delete(@PathVariable String id){
        EncabezadoBoleta encabezadoBoleta = new EncabezadoBoleta();
        encabezadoBoleta.setEstado(false);
        return servicio.delete(EncabezadoBoleta.builder().codigo(id).build());
    }
}
