package pe.edu.upc.vacunacion.controlador;

import pe.edu.upc.vacunacion.entidades.Trabajador;

import java.util.List;

public interface ControladorTrabajador {

    Trabajador crearTrabajador(Trabajador trabajador);
    Trabajador actualizarTrabajador(Trabajador trabajador);
    Trabajador borrarTrabajador(Long codigo);
    List<Trabajador> obtenerTrabajadores();
    Trabajador obtenerTrabajador(Long codigo);
}
