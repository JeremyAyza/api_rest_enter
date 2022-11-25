package pe.edu.idat.servicios;


import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.DetalleBoleta;


public interface DetalleBoletaService {
    
    List<DetalleBoleta> findAll();
    
    List<DetalleBoleta> findAllCustom();

    Optional<DetalleBoleta> findById(Long id);

    DetalleBoleta add(DetalleBoleta detalleBoleta);

    DetalleBoleta update(DetalleBoleta detalleBoleta);

    DetalleBoleta delete(DetalleBoleta detalleBoleta);
}
