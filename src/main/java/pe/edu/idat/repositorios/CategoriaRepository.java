package pe.edu.idat.repositorios;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.edu.idat.entidades.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    @Query("Select ct from CategoriaEntity ct where ct.estado=1")
    List<Categoria> finAllCustom();
}
