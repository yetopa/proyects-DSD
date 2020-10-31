package pe.edu.upc.vacunacion.facade;

import javassist.NotFoundException;
import pe.edu.upc.vacunacion.entidades.Trabajador;

import java.util.List;

public interface FacadeTrabajador {

    Trabajador crearTrabajador(Trabajador trabajador);
    Trabajador actualizarTrabajador(Trabajador trabajador)  throws NotFoundException;
    Trabajador borrarTrabajador(Long codigo) throws NotFoundException;
    List<Trabajador> obtenerTrabajadores();
    Trabajador obtenerTrabajador(Long codigo) throws NotFoundException;
}
