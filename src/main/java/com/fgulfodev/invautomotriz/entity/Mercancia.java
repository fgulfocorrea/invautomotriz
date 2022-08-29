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
@Table(name = "mercancias")
public class Mercancia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;

    private Integer cantidad;

    private Date fechaIngreso;

    private Date fechaModificacion;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Usuario usuarioModificacion;

    public Mercancia() {
    }

    public Mercancia(Long id, String producto, Integer cantidad, Date fechaIngreso, Date fechaModificacion,
            Usuario usuario, Usuario usuarioModificacion) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fechaIngreso = fechaIngreso;
        this.fechaModificacion = fechaModificacion;
        this.usuario = usuario;
        this.usuarioModificacion = usuarioModificacion;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducto() {
        return this.producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioModificacion() {
        return this.usuarioModificacion;
    }

    public void setUsuarioModificacion(Usuario usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", producto='" + getProducto() + "'" +
                ", cantidad='" + getCantidad() + "'" +
                ", fechaIngreso='" + getFechaIngreso() + "'" +
                ", fechaModificacion='" + getFechaModificacion() + "'" +
                ", usuario='" + getUsuario() + "'" +
                ", usuarioModificacion='" + getUsuarioModificacion() + "'" +
                "}";
    }

}
