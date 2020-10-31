package pe.edu.upc.vacunacion.facade;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.upc.vacunacion.entidades.Trabajador;
import pe.edu.upc.vacunacion.servicios.ServicioProducto;

import java.util.List;

@RestController
@RequestMapping("/api/producto")
public class FacadeTrabajadorImpl implements FacadeTrabajador {

    @Autowired
    private ServicioProducto servicioProducto;

    @Override
    @PostMapping
    public Trabajador crearTrabajador(@RequestBody Trabajador trabajador) {
        return servicioProducto.crearTrabajador(trabajador);
    }

    @Override
    @PutMapping
    public Trabajador actualizarTrabajador(@RequestBody Trabajador trabajador) throws NotFoundException {
        try {
            return servicioProducto.actualizarTrabajador(trabajador);
        } catch (NotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al intentar actualizar trabajador:( ");
        }
    }

    @Override
    @DeleteMapping("/{codigo}")
    public Trabajador borrarTrabajador(@PathVariable Long codigo) throws NotFoundException{
        try{
            return servicioProducto.borrarTrabajador(codigo);
        } catch (NotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al intentar borrar trabajador :( ");
        }
    }

    @Override
    @GetMapping
    public List<Trabajador> obtenerTrabajadores() {
        return servicioProducto.obtenerTrabajadores();
    }

    @Override
    @GetMapping("/{codigo}")
    public Trabajador obtenerTrabajador(@PathVariable Long codigo) throws NotFoundException{
        try {
            return servicioProducto.obtenerTrabajador(codigo);
        } catch (NotFoundException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error al intentar obtener trabajador :( ");
        }
    }
}
