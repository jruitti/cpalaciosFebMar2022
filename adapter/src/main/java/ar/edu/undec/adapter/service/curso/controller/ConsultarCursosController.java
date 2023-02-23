package ar.edu.undec.adapter.service.curso.controller;

import ar.edu.undec.adapter.service.curso.model.CursoDTO;
import curso.input.ConsultarCursoInput;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class ConsultarCursosController {

    private ConsultarCursoInput consultarCursoInput;

    public ConsultarCursosController(ConsultarCursoInput consultarCursoInput){
        this.consultarCursoInput=consultarCursoInput;
    }

    public ResponseEntity<List<CursoDTO>> consultarCursos() {
        return new ResponseEntity<CursoDTO>(this.consultarCursoInput.consultarCurso(), HttpStatus.ACCEPTED);
    }
}
