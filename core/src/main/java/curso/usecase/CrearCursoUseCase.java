package curso.usecase;

import curso.input.CrearCursoInput;
import curso.modelo.Curso;
import curso.output.CrearCursoRepositorio;

public class CrearCursoUseCase implements CrearCursoInput {

    private CrearCursoRepositorio crearCursoRepositorio;

    public CrearCursoUseCase(CrearCursoRepositorio crearCursoRepositorio) {

        this.crearCursoRepositorio=crearCursoRepositorio;

    }

    @Override
    public Integer crearCurso(Curso curso) {
        return this.crearCursoRepositorio.guardar(curso);
    }
}
