package ar.edu.undec.adapter.data.curso.repoimplementacion;

import curso.input.CrearCursoInput;
import curso.modelo.Curso;
import curso.output.ConsultarCursoRepositorio;
import curso.output.CrearCursoRepositorio;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CrearCursoRepositorioImplementacion implements CrearCursoRepositorio {

    @Override
    public Boolean existePorNombre(String nombre) {
        return null;
    }

    @Override
    public Integer guardar(Curso curso) {
        return null;
    }
}
