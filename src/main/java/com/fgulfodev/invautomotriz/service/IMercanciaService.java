package com.fgulfodev.invautomotriz.service;

import java.util.List;

import com.fgulfodev.invautomotriz.entity.Mercancia;
import com.fgulfodev.invautomotriz.entity.Usuario;

public interface IMercanciaService {

    public List<Mercancia> findAll();

    public Mercancia create(Mercancia mercancia);

    public Mercancia actualizar(Mercancia mercancia);

    public boolean eliminar(Long id);

    public Mercancia findByNombre(String nombre);

    public Mercancia findByFechaIngreso(String fechaIngreso);

    public Mercancia findByFechaModificacion(String fechaModificacion);

    public Mercancia findByUsaurioIngreso(Usuario usuario);

    public Mercancia findByUsaurioModificacion(Usuario usuario);
}
