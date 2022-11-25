package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.EncabezadoBoleta;


public interface EncabezadoBoletaRepository extends JpaRepository<EncabezadoBoleta, String>{
    @Query("Select e from EncabezadoBoletaEntity e where e.estado=1")
    List<EncabezadoBoleta> finAllCustom();
}
