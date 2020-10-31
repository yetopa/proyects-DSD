package pe.edu.upc.vacunacion.servicios;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import pe.edu.upc.vacunacion.entidades.Trabajador;
import pe.edu.upc.vacunacion.repositorio.RepositorioTrabajador;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProductoImpl implements ServicioProducto {

    @Autowired
    private RepositorioTrabajador repositorioTrabajador;

    @Override
    public Trabajador crearTrabajador(Trabajador trabajador) {
        trabajador.setActivo(true);
        return repositorioTrabajador.save(trabajador);
    }

    @Override
    public Trabajador actualizarTrabajador(Trabajador trabajador) throws NotFoundException{
        if (repositorioTrabajador.existsById(trabajador.getCodigo())){
            return repositorioTrabajador.save(trabajador);
        }
        throw  exceptionTrabajadorNoEncontrado();
    }

    @Override
    public Trabajador borrarTrabajador(Long codigo) throws NotFoundException{
        if (repositorioTrabajador.existsById(codigo)){
            Optional<Trabajador> optionalTrabajador = repositorioTrabajador.findById(codigo);
            Trabajador t = optionalTrabajador.get();
            if (optionalTrabajador.isPresent())  repositorioTrabajador.delete(t);
            t.setActivo(false);
            return t;
        }
        throw  exceptionTrabajadorNoEncontrado();
    }

    @Override
    public List<Trabajador> obtenerTrabajadores() {
        return (List<Trabajador>) repositorioTrabajador.findAll();
    }

    @Override
    public Trabajador obtenerTrabajador(Long codigo) throws NotFoundException{
        Optional<Trabajador> t = repositorioTrabajador.findById(codigo);
        if (t.isPresent()) {
            return t.get();
        } else {
           throw  exceptionTrabajadorNoEncontrado();
        }
    }

    private NotFoundException exceptionTrabajadorNoEncontrado() {
        return new NotFoundException("Trabajador no encontrado.....!!!!");
    }
}
