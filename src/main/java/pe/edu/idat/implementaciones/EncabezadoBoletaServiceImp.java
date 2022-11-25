package pe.edu.idat.implementaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.entidades.EncabezadoBoleta;
import pe.edu.idat.repositorios.EncabezadoBoletaRepository;
import pe.edu.idat.servicios.EncabezadoBoletaService;

@Service
public class EncabezadoBoletaServiceImp implements EncabezadoBoletaService{

    @Autowired
    private EncabezadoBoletaRepository repositorio;
    
    @Override
    public List<EncabezadoBoleta> findAll() {
        return repositorio.findAll();
    }
    
    @Override
    public List<EncabezadoBoleta> findAllCustom() {
       return repositorio.finAllCustom();
    }

    @Override
    public Optional<EncabezadoBoleta> findById(String id) {
        return repositorio.findById(id);
    }

    @Override
    public EncabezadoBoleta add(EncabezadoBoleta encabezadoBoleta) {
        return repositorio.save(encabezadoBoleta);
    }

    @Override
    public EncabezadoBoleta update(EncabezadoBoleta encabezadoBoleta) {
        EncabezadoBoleta eb = repositorio.getById(encabezadoBoleta.getCodigo());
        BeanUtils.copyProperties(encabezadoBoleta, eb);
        return repositorio.save(eb);
    }

    @Override
    public EncabezadoBoleta delete(EncabezadoBoleta encabezadoBoleta) {
        EncabezadoBoleta eb = repositorio.getById(encabezadoBoleta.getCodigo());
        eb.setEstado(false);
        return repositorio.save(eb);
    }
    
}
