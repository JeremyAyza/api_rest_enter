package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.Rol;


public interface RolRepository extends JpaRepository<Rol, Long>{
    @Query("Select r from RolEntity r where r.estado=1")
    List<Rol> finAllCustom();
}
