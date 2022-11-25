package pe.edu.idat.implementaciones;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.idat.entidades.Categoria;
import pe.edu.idat.repositorios.CategoriaRepository;
import pe.edu.idat.servicios.CategoriaService;

@Service
public class CategoriaServiceImp implements CategoriaService {

    @Autowired
    private CategoriaRepository repositorio;

    @Override
    public List<Categoria> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<Categoria> findAllCustom() {
        return repositorio.finAllCustom();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public Categoria add(Categoria categoria) {
        return repositorio.save(categoria);
    }

    @Override
    public Categoria update(Categoria categoria) {
        Categoria nueva_categoria = repositorio.getById(categoria.getCodigo());
        BeanUtils.copyProperties(categoria, nueva_categoria);
        return repositorio.save(nueva_categoria);
    }

    @Override
    public Categoria delete(Categoria categoria) {
        Categoria nueva_categoria = repositorio.getById(categoria.getCodigo());
        nueva_categoria.setEstado(false);
        return repositorio.save(nueva_categoria);
    }

}
