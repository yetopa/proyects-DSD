package pe.edu.upc.vacunacion.servicios;

import javassist.NotFoundException;
import pe.edu.upc.vacunacion.entidades.Trabajador;

import java.util.List;

public interface ServicioProducto {

    Trabajador crearTrabajador(Trabajador trabajador) throws Exception;
    Trabajador actualizarTrabajador(Trabajador trabajador) throws NotFoundException;
    Trabajador borrarTrabajador(Long codigo) throws NotFoundException;
    List<Trabajador> obtenerTrabajadores();
    Trabajador obtenerTrabajador(Long codigo) throws NotFoundException;
}
