package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.Producto;


public interface ProductoRepository extends JpaRepository<Producto, Long>{
    @Query("Select p from ProductoEntity p where p.estado=1")
    List<Producto> finAllCustom();
}
