package com.fgulfodev.invautomotriz.service;

import java.util.List;

import com.fgulfodev.invautomotriz.entity.Usuario;

public interface IUsuarioService {

    public List<Usuario> findAll();

    public Usuario create(Usuario usuario);

    public Usuario actualizar(Usuario usuario);

    public boolean eliminar(Long id);

    public Usuario findByNombre(String nombre);
}
