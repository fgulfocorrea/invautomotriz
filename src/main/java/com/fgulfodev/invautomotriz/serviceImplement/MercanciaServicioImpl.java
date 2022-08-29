package com.fgulfodev.invautomotriz.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgulfodev.invautomotriz.dao.IMercanciaDao;
import com.fgulfodev.invautomotriz.entity.Mercancia;
import com.fgulfodev.invautomotriz.entity.Usuario;
import com.fgulfodev.invautomotriz.service.IMercanciaService;

@Service
public class MercanciaServicioImpl implements IMercanciaService {

    @Autowired
    private IMercanciaDao mercanciaDao;

    @Override
    public List<Mercancia> findAll() {

        return mercanciaDao.findAll();
    }

    @Override
    public Mercancia create(Mercancia mercancia) {

        return mercanciaDao.save(mercancia);
    }

    @Override
    public Mercancia actualizar(Mercancia mercancia) {

        return mercanciaDao.save(mercancia);
    }

    @Override
    public boolean eliminar(Long id) {
        boolean estado = false;
        Mercancia mercancia = new Mercancia();
        if (!mercanciaDao.findById(id).isEmpty()) {
            mercancia = mercanciaDao.findById(id).get();
            mercanciaDao.delete(mercancia);
            estado = true;
        }
        return estado;
    }

    @Override
    public Mercancia findByNombre(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mercancia findByFechaIngreso(String fechaIngreso) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mercancia findByFechaModificacion(String fechaModificacion) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mercancia findByUsaurioIngreso(Usuario usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Mercancia findByUsaurioModificacion(Usuario usuario) {
        // TODO Auto-generated method stub
        return null;
    }

}
