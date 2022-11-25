
package pe.edu.idat.servicios;


import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.Empleado;

public interface EmpleadoService {
    List<Empleado> findAll();
    
    List<Empleado> findAllCustom();

    Optional<Empleado> findById(Long id);

    Empleado add(Empleado empleado);

    Empleado update(Empleado empleado);

    Empleado delete(Empleado empleado);
}
