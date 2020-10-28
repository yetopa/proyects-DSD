package pe.edu.upc.vacunacion.controlador;

import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.vacunacion.entidades.Trabajador;
import pe.edu.upc.vacunacion.servicios.ServicioProducto;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class ControladorTrabajadorImpl implements ControladorTrabajador{

    @Autowired
    private ServicioProducto servicioProducto;

    @Override
    @PostMapping
    public Trabajador crearTrabajador(@RequestBody Trabajador trabajador) {
        return servicioProducto.crearTrabajador(trabajador);
    }

    @Override
    @PutMapping
    public Trabajador actualizarTrabajador(@RequestBody Trabajador trabajador) {
        return servicioProducto.actualizarTrabajador(trabajador);
    }

    @Override
    @DeleteMapping("/{codigo}")
    public Trabajador borrarTrabajador(@PathVariable Long codigo) {
        return servicioProducto.borrarTrabajador(codigo);
    }

    @Override
    @GetMapping
    public List<Trabajador> obtenerTrabajadores() {
        return servicioProducto.obtenerTrabajadores();
    }

    @Override
    @GetMapping("/{codigo}")
    public Trabajador obtenerTrabajador(@PathVariable Long codigo) {
        return servicioProducto.obtenerTrabajador(codigo);
    }
}
