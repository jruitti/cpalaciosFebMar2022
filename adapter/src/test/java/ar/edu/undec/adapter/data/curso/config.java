package ar.edu.undec.adapter.data.curso;

import curso.output.ConsultarCursoRepositorio;
import curso.output.CrearCursoRepositorio;
import curso.usecase.ConsultarCursoUseCase;
import curso.usecase.CrearCursoUseCase;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    public CrearCursoUseCase crearCursoUseCase(CrearCursoRepositorio crearCursoRepositorio){
        return new CrearCursoUseCase(crearCursoRepositorio);
    }

    public ConsultarCursoUseCase consultarCursoUseCase(ConsultarCursoRepositorio consultarCursoRepositorio){
        return new ConsultarCursoUseCase(consultarCursoRepositorio);
    }

}