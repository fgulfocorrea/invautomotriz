package com.fgulfodev.invautomotriz.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgulfodev.invautomotriz.dao.IUsuarioDao;
import com.fgulfodev.invautomotriz.entity.Usuario;
import com.fgulfodev.invautomotriz.service.IUsuarioService;

@Service
public class UsuarioServicioImpl implements IUsuarioService {

    @Autowired
    private IUsuarioDao usuarioDao;

    @Override
    public List<Usuario> findAll() {
        return usuarioDao.findAll();
    }

    @Override
    public Usuario create(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public Usuario actualizar(Usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    public boolean eliminar(Long id) {
        boolean estado = false;
        Usuario usuario = new Usuario();
        if (!usuarioDao.findById(id).isEmpty()) {
            usuario = usuarioDao.findById(id).get();
            usuarioDao.delete(usuario);
            estado = true;
        }
        return estado;
    }

    @Override
    public Usuario findByNombre(String nombre) {

        return null;
    }

}
