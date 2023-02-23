package ar.edu.undec.adapter.data.curso.repoimplementacion;

import curso.modelo.Curso;
import curso.output.ConsultarCursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ConsultarCursoRepositorioImplementacion implements ConsultarCursoRepositorio {
    @Override
    public Collection<Curso> obtenerCurso() {
        return null;
    }
}
