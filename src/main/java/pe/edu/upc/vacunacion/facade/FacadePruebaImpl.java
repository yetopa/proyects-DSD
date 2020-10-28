package pe.edu.upc.vacunacion.facade;

import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.vacunacion.entidad.Prueba;
import pe.edu.upc.vacunacion.servicio.ServicioPrueba;

import java.util.Calendar;
import java.util.List;

@RestController
@RequestMapping("/api/prueba")
public class FacadePruebaImpl implements FacadePrueba{

    @Autowired
    private ServicioPrueba servicioPrueba;

    @Override
    @PostMapping
    public Prueba crearPrueba() {
        Prueba p = new Prueba();
        p.setFecha(Calendar.getInstance().getTime());
        p.setDetalle(RandomString.make());
        servicioPrueba.crearPrueba(p);
        return p;
    }

    @Override
    @GetMapping
    public List<Prueba> listarPuebas() {
        return servicioPrueba.listarPuebas();
    }
}
