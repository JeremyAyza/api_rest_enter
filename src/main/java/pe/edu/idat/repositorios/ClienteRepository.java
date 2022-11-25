package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.Cliente;


public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
    @Query("Select c from ClienteEntity c where c.estado=1")
    List<Cliente> finAllCustom();
}
