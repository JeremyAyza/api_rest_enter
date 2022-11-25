package pe.edu.idat.servicios;


import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.Rol;


public interface RolService {
    
    List<Rol> findAll();
    
    List<Rol> findAllCustom();

    Optional<Rol> findById(Long id);

    Rol add(Rol rol);

    Rol update(Rol rol);

    Rol delete(Rol rol);
}
