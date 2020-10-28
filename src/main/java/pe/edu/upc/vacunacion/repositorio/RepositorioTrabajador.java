package pe.edu.upc.vacunacion.repositorio;

import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.vacunacion.entidades.Trabajador;

public interface RepositorioTrabajador extends CrudRepository<Trabajador, Long> {

}
