package factory;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FactoryCurso {

    private FactoryCurso() {
    }

    public static Curso sample(Integer id) {
        return Curso.instancia(null, "Java", LocalDate.MIN, "Inicial");
    }

    public static Collection<Curso> sampleMany(Integer cantidad) {
        return IntStream.range(0, cantidad).mapToObj(FactoryCurso::sample).collect(Collectors.toList());
    }
}
