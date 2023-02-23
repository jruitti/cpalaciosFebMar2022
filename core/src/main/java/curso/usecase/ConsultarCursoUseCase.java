package curso.usecase;

import curso.input.ConsultarCursoInput;
import curso.modelo.Curso;
import curso.output.ConsultarCursoRepositorio;

import java.util.Collection;

public class ConsultarCursoUseCase implements ConsultarCursoInput {

    private ConsultarCursoRepositorio consultarCursoRepositorio;

    public ConsultarCursoUseCase(ConsultarCursoRepositorio consultarCursoRepositorio) {

        this.consultarCursoRepositorio= consultarCursoRepositorio;

    }

    @Override
    public Collection<Curso> consultarCurso() {
        return this.consultarCursoRepositorio.obtenerCurso();
    }
}
