package cl.project.cursospring.repository;

import cl.project.cursospring.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepo extends CrudRepository<Producto,Integer> {
}
