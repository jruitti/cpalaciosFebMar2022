package ar.edu.undec.adapter.data.curso;

import ar.edu.undec.adapter.data.exception.DataBaseException;
import ar.edu.undec.adapter.factory.FactoryCursoAdapter;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CrearCursoDataTest {

    @InjectMocks
    CrearCursoRepositorioImplementacion crearCursoRepositorioImplementacion;

    @Mock
    CrearCursoCrud crearCursoCrud;

    @Test
    public void crearCurso_ProcesoCorrecto_DevuelveID() {
        Curso CursoCore = FactoryCursoAdapter.sampleCore(null);
        when(crearCursoCrud.save(any(CursoEntity.class))).thenReturn(FactoryCursoAdapter.sampleEntity(1));
        Integer nuevoId = crearCursoRepositorioImplementacion.guardar(CursoCore);
        assertEquals(1, nuevoId);
    }

    @Test
    public void crearCurso_FallaBaseDeDatos_DatabaseException() {
        doThrow(RuntimeException.class).when(crearCursoCrud.save(any(CursoEntity.class)));
        Curso CursoCore = FactoryCursoAdapter.sampleCore(null);
        assertThrows(DataBaseException.class, () -> crearCursoRepositorioImplementacion.guardar(CursoCore));
    }

    @Test
    public void existePorNombre_Existe_DevuelveTrue() {
        Curso CursoCore = FactoryCursoAdapter.sampleCore(null);
        when(crearCursoCrud.existsByNombre("javanull")).thenReturn(true);
        Boolean resultado = crearCursoRepositorioImplementacion.existePorNombre(CursoCore.getNombre());
        assertTrue(resultado);
    }

    @Test
    public void existePorNombre_NoExiste_DevuelveFalse() {
        Curso CursoCore = FactoryCursoAdapter.sampleCore(null);
        when(crearCursoCrud.existsByNombre("javanull")).thenReturn(false);
        Boolean resultado = crearCursoRepositorioImplementacion.existePorNombre(CursoCore.getNombre());
        assertFalse(resultado);
    }
}
