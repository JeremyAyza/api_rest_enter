package pe.edu.idat.servicios;

import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.Producto;


public interface ProductoService {
    
    List<Producto> findAll();
    
    List<Producto> findAllCustom();

    Optional<Producto> findById(Long id);

    Producto add(Producto producto);

    Producto update(Producto producto);

    Producto delete(Producto producto);
}
