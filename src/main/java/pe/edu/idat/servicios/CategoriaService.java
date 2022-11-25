package pe.edu.idat.servicios;


import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.Categoria;


public interface CategoriaService {
    
    List<Categoria> findAll();
    
    List<Categoria> findAllCustom();

    Optional<Categoria> findById(Long id);

    Categoria add(Categoria categoria);

    Categoria update(Categoria categoria);

    Categoria delete(Categoria categoria);
}
