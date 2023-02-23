package ar.edu.undec.adapter.data.curso.crud;

import ar.edu.undec.adapter.data.curso.model.CursoEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrearCursoCrud extends CrudRepository<CursoEntity, Integer> {

    Boolean existsByNombre(String nombre);


}
