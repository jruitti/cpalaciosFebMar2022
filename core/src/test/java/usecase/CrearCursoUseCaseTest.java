package usecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CrearCursoUseCaseTest {

    CrearCursoInput crearCursoInput;

    @Mock
    CrearCursoRepositorio crearCursoRepositorio;

    @BeforeEach
    void setup() {
        crearCursoInput = new CrearCursoUseCase(crearCursoRepositorio);
    }

    @Test
    public void crearCurso_noExisteCurso_CreaCorrectamente() {
        Curso nuevoCurso = Curso.instancia(null, "Java", LocalDate.MIN, "Inicial");
        when(crearCursoRepositorio.existePorNombre("Java")).thenReturn(false);
        when(crearCursoRepositorio.guardar(nuevoCurso)).thenReturn(1);
        Integer idGenerado = crearCursoInput.crearCurso(nuevoCurso);
        assertEquals(1, idGenerado);
    }

    @Test
    public void crearCurso_ExisteCurso_CursoExisteException() {
        Curso nuevoCurso = Curso.instancia(null, "Java", LocalDate.MIN, "Inicial");
        when(crearCursoRepositorio.existePorNombre("Java")).thenReturn(true);
        verify(crearCursoRepositorio, never()).guardar(nuevoCurso);
        Exception exception = assertThrows(CursoExisteException.class, () -> crearCursoInput.crearCurso(nuevoCurso));
        assertEquals("Ya existe un Curso con nombre Java", exception.getMessage());
    }
}
