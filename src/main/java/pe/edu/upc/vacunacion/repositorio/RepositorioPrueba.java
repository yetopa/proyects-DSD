package pe.edu.upc.vacunacion.repositorio;

import org.springframework.data.repository.CrudRepository;
import pe.edu.upc.vacunacion.entidad.Prueba;

public interface RepositorioPrueba extends CrudRepository<Prueba, Long> {
}
