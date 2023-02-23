package ar.edu.undec.adapter.service.curso;

import ar.edu.undec.adapter.factory.FactoryCursoAdapter;
import ar.edu.undec.adapter.service.curso.controller.ConsultarCursosController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultarCursosServiceTest {

    @InjectMocks
    ConsultarCursosController consultarCursosController;

    @Mock
    ConsultarCursosInput consultarCursosInput;

    @BeforeEach
    void setup() {
        consultarCursosController = new ConsultarCursosController(consultarCursosInput);
    }

    @Test
    void consultarCursos_ExistenCursos_Devuelve200() {
        when(consultarCursosInput.consultarCursos()).thenReturn(FactoryCursoAdapter.sampleManyCore(3));
        ResponseEntity<List<CursoDTO>> response = consultarCursosController.consultarCursos();
        assertEquals(3, Objects.requireNonNull(response.getBody()).size());
        assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    void consultarCursos_NoExistenCursos_Devuelve204() {
        when(consultarCursosInput.consultarCursos()).thenReturn(Collections.emptyList());
        ResponseEntity<List<CursoDTO>> response = consultarCursosController.consultarCursos();
        assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
    }
}
