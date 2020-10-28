package pe.edu.upc.vacunacion.servicios;

import pe.edu.upc.vacunacion.entidades.Trabajador;

import java.util.List;

public interface ServicioProducto {

    Trabajador crearTrabajador(Trabajador trabajador);
    Trabajador actualizarTrabajador(Trabajador trabajador);
    Trabajador borrarTrabajador(Long codigo);
    List<Trabajador> obtenerTrabajadores();
    Trabajador obtenerTrabajador(Long codigo);
}
