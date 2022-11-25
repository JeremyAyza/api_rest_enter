
package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    @Query("Select ep from EmpleadoEntity ep where ep.estado=1")
    List<Empleado> finAllCustom();
    
}
