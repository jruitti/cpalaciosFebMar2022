package model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CursoUnitTest {

    @Test
    void instancia_TodosLosAtributos_InstanciaCorrecta() {
        Curso unCurso = Curso.instancia(1, "nombre", LocalDate.MIN, "Inicial");
        assertNotNull(unCurso);
    }

    @Test
    void instancia_FaltaNombre_CursoIncompletoException() {
        Exception exceptionNull = assertThrows(CursoIncompletoException.class, () -> Curso.instancia(1, null, LocalDate.MIN, "Inicial"));
        Exception exceptionVacio = assertThrows(CursoIncompletoException.class, () -> Curso.instancia(1, "", LocalDate.MIN, "Inicial"));
        assertEquals("El nombre del Curso es obligatorio", exceptionNull.getMessage());
        assertEquals("El nombre del Curso es obligatorio", exceptionVacio.getMessage());
    }

    @Test
    void instancia_FaltaFechaInscripcion_CursoIncompletoException() {
        Exception exceptionNull = assertThrows(CursoIncompletoException.class, () -> Curso.instancia(1, "nombre", null, "Inicial"));
        assertEquals("La fecha de cierre del Curso es obligatoria", exceptionNull.getMessage());
    }

    @Test
    public void crearCurso_FechaInferior_CursoIncorrectoException() {
        Exception exceptionMalformed = assertThrows(CursoIncorrectoException.class, () -> Curso.instancia(null, "max", LocalDate.MIN, "Inicial"));
        assertEquals("La fecha de cierre del Curso no puede ser inferior a la actual", exceptionMalformed.getMessage());
    }

    @Test
    void instancia_FaltaNivel_CursoIncompletoException() {
        Exception exceptionNull = assertThrows(CursoIncompletoException.class, () -> Curso.instancia(1, "nombre", LocalDate.MAX, null));
        Exception exceptionVacio = assertThrows(CursoIncompletoException.class, () -> Curso.instancia(1, "nombre", LocalDate.MAX, ""));
        assertEquals("El nivel del Curso es obligatorio", exceptionNull.getMessage());
        assertEquals("El nivel del Curso es obligatorio", exceptionVacio.getMessage());
    }
}
