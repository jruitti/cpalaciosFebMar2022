package curso.output;

import curso.modelo.Curso;

public interface CrearCursoRepositorio {
    Boolean existePorNombre(String nombre);

    Integer guardar(Curso curso);
}
