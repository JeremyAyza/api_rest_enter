
package pe.edu.idat.implementaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.entidades.Empleado;
import pe.edu.idat.repositorios.EmpleadoRepository;
import pe.edu.idat.servicios.EmpleadoService;

@Service
public class EmpleadoServiceImp implements EmpleadoService{

    @Autowired
    private EmpleadoRepository repositorio;
    
    @Override
    public List<Empleado> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Empleado> findAllCustom() {
        return repositorio.finAllCustom();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Empleado add(Empleado empleado) {
        return repositorio.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) {
        Empleado nuevo_empleado = repositorio.getById(empleado.getCodigo());
        BeanUtils.copyProperties(empleado, nuevo_empleado);
        return repositorio.save(nuevo_empleado);
    }

    @Override
    public Empleado delete(Empleado empleado) {
        Empleado nuevo_empleado = repositorio.getById(empleado.getCodigo());
        nuevo_empleado.setEstado(false);
        return repositorio.save(nuevo_empleado);
    }
}
