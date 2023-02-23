package ar.edu.undec.adapter.service.curso.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class CursoDTO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nombre")
    private String  nombre;

    @JsonProperty("fecha")
    private LocalDate fechaCreacion;

    @JsonProperty("nivel")
    private String nivel;

    public CursoDTO(@JsonProperty("id") Integer id,
                      @JsonProperty("nombre") String nombre,
                      @JsonProperty("fecha") LocalDate fechaCreacion,
                      @JsonProperty("nivel") String nivel) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion= fechaCreacion;
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

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
}
