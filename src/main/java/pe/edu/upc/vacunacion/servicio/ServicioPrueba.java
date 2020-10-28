package pe.edu.upc.vacunacion.servicio;

import pe.edu.upc.vacunacion.entidad.Prueba;

import java.util.List;

public interface ServicioPrueba {

    Prueba crearPrueba(Prueba prueba);
    List<Prueba> listarPuebas();
}
