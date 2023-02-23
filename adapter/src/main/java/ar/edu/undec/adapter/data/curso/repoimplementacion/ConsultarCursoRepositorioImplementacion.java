package ar.edu.undec.adapter.data.curso.repoimplementacion;

import ar.edu.undec.adapter.data.curso.crud.ConsultarCursoCRUD;
import curso.modelo.Curso;
import curso.output.ConsultarCursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ConsultarCursoRepositorioImplementacion implements ConsultarCursoRepositorio {

    @Autowired
    ConsultarCursoCRUD consultarCursoCRUD;

    @Override
    public Collection<Curso> obtenerCurso() {
        Collection<Curso> cursos = new ArrayList<>();
        this.consultarCursoCRUD.findAll().forEach(ce ->{
            cursos.add(ce.getId(),ce.getNombre(),ce.getFechaCierre(),ce.getNivel());
        });

        return cursos;
    }
}
