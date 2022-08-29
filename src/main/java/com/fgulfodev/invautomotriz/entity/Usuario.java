package com.fgulfodev.invautomotriz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Integer edad;

    @ManyToOne()
    private Cargo cargo;

    private Date fechaIngreso;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, Integer edad, Cargo cargo, Date fechaIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
        this.fechaIngreso = fechaIngreso;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return this.edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", edad='" + getEdad() + "'" +
                ", cargo='" + getCargo() + "'" +
                ", fechaIngreso='" + getFechaIngreso() + "'" +
                "}";
    }
}
