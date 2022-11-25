package pe.edu.idat.servicios;


import java.util.List;
import java.util.Optional;
import pe.edu.idat.entidades.Cliente;


public interface ClienteService {
    
    List<Cliente> findAll();
    
    List<Cliente> findAllCustom();

    Optional<Cliente> findById(Long id);

    Cliente add(Cliente cliente);

    Cliente update(Cliente categoria);

    Cliente delete(Cliente categoria);
}
