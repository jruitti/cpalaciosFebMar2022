package curso.modelo;

import curso.exception.CursoIncompletoException;
import curso.exception.CursoIncorrectoException;

import java.time.LocalDate;

public class Curso {

    private Integer id;
    private String nombre;
    private LocalDate fechaCierra;
    private String nivel;

    public Curso(Integer id, String nombre, LocalDate fecha, String nivel){
        this.id= id;
        this.nombre= nombre;
        this.fechaCierra= fecha;
        this.nivel= nivel;
    }


    public static Curso instancia(Integer i, String nombre, LocalDate min, String inicial)  {

        if(nombre == ""){
            throw new CursoIncompletoException("El nombre del Curso es obligatorio");
        }
        if(nombre == null){
            throw new CursoIncompletoException("El nombre del Curso es obligatorio");
        }

        if(min == null){
            throw new CursoIncompletoException("La fecha de cierre del Curso es obligatoria");
        }

        if(inicial == ""){
            throw new CursoIncompletoException("El nivel del Curso es obligatorio");
        }

        if(inicial == null){
            throw new CursoIncompletoException("El nivel del Curso es obligatorio");
        }

        return new Curso(i, nombre, min, inicial);

    }


    public Curso(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCierra() {
        return fechaCierra;
    }

    public void setFechaCierra(LocalDate fechaCierra) {
        this.fechaCierra = fechaCierra;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
