package pe.edu.upc.vacunacion.facade;

import pe.edu.upc.vacunacion.entidad.Prueba;

import java.util.List;

public interface FacadePrueba {
    Prueba crearPrueba();
    List<Prueba> listarPuebas();

}
