package ar.edu.undec.adapter.service.curso;

import ar.edu.undec.adapter.factory.FactoryCursoAdapter;
import ar.edu.undec.adapter.service.curso.controller.CrearCursoController;
import ar.edu.undec.adapter.service.curso.model.CursoDTO;
import curso.exception.CursoExisteException;
import curso.input.CrearCursoInput;
import curso.modelo.Curso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith({MockitoExtension.class})
public class CrearCursoServiceTest {

    @InjectMocks
    CrearCursoController crearCursoController;

    @Mock
    CrearCursoInput crearCursoInput;

    @BeforeEach
    void setup() {
        crearCursoController = new CrearCursoController(crearCursoInput);
    }

    @Test
    public void crearCurso_ProcesoCorrecto_Devuelve201Created() {
        CursoDTO nuevoCurso = FactoryCursoAdapter.sampleDTO(null);
        when(crearCursoInput.crearCurso(any(Curso.class))).thenReturn(1);
        ResponseEntity<Integer> response = crearCursoController.crearCurso(nuevoCurso);
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
        assertEquals(1, response.getBody());
    }

    @Test
    public void crearCurso_CursoExiste_Devuelve400BadRequest() {
        CursoDTO nuevoCurso = FactoryCursoAdapter.sampleDTO(null);
        doThrow(CursoExisteException.class).when(crearCursoInput).crearCurso(any(Curso.class));
        ResponseEntity<String> response = crearCursoController.crearCurso(nuevoCurso);
        assertEquals(HttpStatus.BAD_REQUEST, response.getStatusCode());
    }
}
