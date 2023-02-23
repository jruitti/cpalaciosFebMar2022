package ar.edu.undec.adapter.service.curso.controller;

import ar.edu.undec.adapter.service.curso.model.CursoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class ConsultarCursosController {


    public ResponseEntity<List<CursoDTO>> consultarCursos() {
    }
}
