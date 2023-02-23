package ar.edu.undec.adapter.data.curso.repoimplementacion;

import ar.edu.undec.adapter.data.curso.crud.ConsultarCursoCRUD;
import curso.modelo.Curso;
import curso.output.ConsultarCursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ConsultarCursoRepositorioImplementacion implements ConsultarCursoRepositorio {

    @Autowired
    ConsultarCursoCRUD consultarCursoCRUD;

    @Override
    public Collection<Curso> obtenerCurso() {
        return null;
    }
}
