package ar.edu.undec.adapter.data.curso.crud;

import ar.edu.undec.adapter.data.curso.model.CursoEntity;
import org.springframework.data.repository.CrudRepository;

public interface ConsultarCursoCRUD extends CrudRepository<CursoEntity, Integer> {
}
