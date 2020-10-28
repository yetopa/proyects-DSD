package pe.edu.upc.vacunacion.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pe.edu.upc.vacunacion.entidad.Prueba;
import pe.edu.upc.vacunacion.repositorio.RepositorioPrueba;

import java.util.List;

@Service
public class ServicioPruebaImpl implements ServicioPrueba{

    @Autowired
    RepositorioPrueba repositorioPrueba;

    @Override
    public Prueba crearPrueba(Prueba prueba) {
        return repositorioPrueba.save(prueba);
    }

    @Override
    public List<Prueba> listarPuebas() {
        return (List<Prueba>) repositorioPrueba.findAll();
    }
}
