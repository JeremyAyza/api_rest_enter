package pe.edu.idat.implementaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.entidades.Producto;
import pe.edu.idat.repositorios.ProductoRepository;
import pe.edu.idat.servicios.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{

    @Autowired
    private ProductoRepository repositorio;
    
    @Override
    public List<Producto> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<Producto> findAllCustom() {
       return repositorio.finAllCustom();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Producto add(Producto producto) {
        return repositorio.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        Producto p = repositorio.getById(producto.getCodigo());
        BeanUtils.copyProperties(producto, p);
        return repositorio.save(p);
    }

    @Override
    public Producto delete(Producto producto) {
        Producto p = repositorio.getById(producto.getCodigo());
        p.setEstado(false);
        return repositorio.save(p);
    }
    
    
}
