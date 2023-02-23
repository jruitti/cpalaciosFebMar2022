package ar.edu.undec.adapter.service.curso.controller;

import ar.edu.undec.adapter.data.curso.model.CursoEntity;
import ar.edu.undec.adapter.service.curso.model.CursoDTO;
import curso.input.CrearCursoInput;
import curso.modelo.Curso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/curso")
public class CrearCursoController {

    private CrearCursoInput crearCursoInput;

    public CrearCursoController(CrearCursoInput crearCursoInput) {
        this.crearCursoInput= crearCursoInput;
    }

    @PostMapping
    public ResponseEntity<Integer> crearCurso(@RequestBody CursoDTO nuevoCurso) {
        Curso curso= new Curso();
        curso.setId(nuevoCurso.getId());
        curso.setNombre(nuevoCurso.getNombre());
        curso.setFechaCierra(nuevoCurso.getFechaCreacion());
        curso.setNivel(nuevoCurso.getNivel());

        return new ResponseEntity<Integer>(this.crearCursoInput.crearCurso(curso), HttpStatus.ACCEPTED);
    }

}
