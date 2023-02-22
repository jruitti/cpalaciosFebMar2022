package usecase;

import factory.FactoryCurso;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultarCursosUseCaseTest {

    ConsultarCursoInput consultarCursoInput;

    @Mock
    ConsultarCursoRepositorio consultarCursoRepositorio;

    @BeforeEach
    void setup() {
        consultarCursoInput = new ConsultarCursoUseCase(consultarCursoRepositorio);
    }

    @Test
    public void consultarCurso_ExistenCurso_DevuelveColeccion() {
        when(consultarCursoRepositorio.obtenerCurso()).thenReturn(FactoryCurso.sampleMany(2));
        Collection<Curso> Curso = consultarCursoInput.consultarCurso();
        assertEquals(2, Curso.size());
    }

    @Test
    public void consultarCurso_ExistenCurso_DevuelveColeccionVacia() {
        when(consultarCursoRepositorio.obtenerCurso()).thenReturn(Collections.emptyList());
        Collection<Curso> Curso = consultarCursoInput.consultarCurso();
        assertEquals(0, Curso.size());
    }
}
