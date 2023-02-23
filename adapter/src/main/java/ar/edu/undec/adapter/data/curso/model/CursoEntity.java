package ar.edu.undec.adapter.data.curso.model;


import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "curso")
@SequenceGenerator(name = "curso_id_seq", initialValue = 1, allocationSize = 1, sequenceName = "curso_id_seq")
public class CursoEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "curso_id_seq")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_cierre")
    private LocalDate fechaCierre;

    @Column(name = "nivel")
    private String nivel;

    public CursoEntity() {
    }

    public CursoEntity(Integer id, String nombre, LocalDate fechaCierre, String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCierre = fechaCierre;
        this.nivel = nivel;
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

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
