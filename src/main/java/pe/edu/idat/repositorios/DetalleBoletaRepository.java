package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.DetalleBoleta;


public interface DetalleBoletaRepository extends JpaRepository<DetalleBoleta, Long>{
    @Query("Select dt from DetalleBoletaEntity dt where dt.estado=1")
    List<DetalleBoleta> finAllCustom();
}
