package ar.edu.undec.adapter.data.curso;

import ar.edu.undec.adapter.data.curso.crud.ConsultarCursoCRUD;
import ar.edu.undec.adapter.data.curso.repoimplementacion.ConsultarCursoRepositorioImplementacion;
import ar.edu.undec.adapter.factory.FactoryCursoAdapter;
import curso.modelo.Curso;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ConsultarCursoDataTest {
    @InjectMocks
    ConsultarCursoRepositorioImplementacion consultarCursoRepositorioImplementacion;

    @Mock
    ConsultarCursoCRUD consultarCursoCRUD;

    @Test
    void consultarCurso_ExistenCursos_DevuelveListaConCursos() {
        when(consultarCursoCRUD.findAll()).thenReturn(FactoryCursoAdapter.sampleManyEntity(3));
        List<Curso> Curso = (List<Curso>) consultarCursoRepositorioImplementacion.obtenerCurso();
        assertEquals(3, Curso.size());
    }

    @Test
    void consultarCurso_NoExistenCursos_DevuelveListaVacia() {
        when(consultarCursoCRUD.findAll()).thenReturn(Collections.emptyList());
        List<Curso> Curso = (List<Curso>) consultarCursoRepositorioImplementacion.obtenerCurso();
        assertEquals(0, Curso.size());
    }
}
