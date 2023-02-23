package ar.edu.undec.adapter.factory;

import ar.edu.undec.adapter.data.curso.model.CursoEntity;
import ar.edu.undec.adapter.service.curso.model.CursoDTO;
import curso.modelo.Curso;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactoryCursoAdapter {

    private FactoryCursoAdapter() {
    }

    public static CursoEntity sampleEntity(Integer id) {
        return new CursoEntity(id, "java" + id, LocalDate.MIN, "Inicial");
    }

    public static Collection<CursoEntity> sampleManyEntity(Integer cantidad) {
        return IntStream.range(0, cantidad).mapToObj(FactoryCursoAdapter::sampleEntity).collect(Collectors.toList());
    }

    public static CursoDTO sampleDTO(Integer id) {
        return new CursoDTO(id, "java" + id, LocalDate.MIN, "Inicial");
    }

    public static Collection<CursoDTO> sampleManyDTO(Integer cantidad) {
        return IntStream.range(0, cantidad).mapToObj(FactoryCursoAdapter::sampleDTO).collect(Collectors.toList());
    }

    public static Curso sampleCore(Integer id) {
        return Curso.instancia(id, "java" + id, LocalDate.MIN, "Inicial");
    }

    public static Collection<Curso> sampleManyCore(Integer cantidad) {
        return IntStream.range(0, cantidad).mapToObj(FactoryCursoAdapter::sampleCore).collect(Collectors.toList());
    }
}

