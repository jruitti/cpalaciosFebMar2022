package ar.edu.undec.adapter.data.curso.repoimplementacion;

import ar.edu.undec.adapter.data.curso.crud.CrearCursoCrud;
import ar.edu.undec.adapter.data.curso.model.CursoEntity;

import curso.modelo.Curso;

import curso.output.CrearCursoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CrearCursoRepositorioImplementacion implements CrearCursoRepositorio {

    @Autowired
    CrearCursoCrud crearCursoCrud;

    @Override
    public Boolean existePorNombre(String nombre) {
        return this.crearCursoCrud.existsByNombre(nombre);
    }

    @Override
    public Integer guardar(Curso curso) {

        CursoEntity cursoEntity = new CursoEntity();

        cursoEntity.setId(curso.getId());
        cursoEntity.setNombre(curso.getNombre());
        cursoEntity.setFechaCierre(curso.getFechaCierra());
        cursoEntity.setNivel(curso.getNivel());


        return this.crearCursoCrud.save(cursoEntity).getId();

    }
}
