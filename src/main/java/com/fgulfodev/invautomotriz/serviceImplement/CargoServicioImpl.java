package com.fgulfodev.invautomotriz.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fgulfodev.invautomotriz.dao.ICargoDao;
import com.fgulfodev.invautomotriz.entity.Cargo;
import com.fgulfodev.invautomotriz.service.ICargoService;

@Service
public class CargoServicioImpl implements ICargoService {

    @Autowired
    private ICargoDao cargoDao;

    @Override
    public List<Cargo> findAll() {

        return cargoDao.findAll();
    }

    @Override
    public Cargo create(Cargo cargo) {

        return cargoDao.save(cargo);
    }

    @Override
    public Cargo actualizar(Cargo cargo) {

        return cargoDao.save(cargo);
    }

    @Override
    public boolean eliminar(Long id) {
        boolean estado = false;
        Cargo cargo = new Cargo();
        if (!cargoDao.findById(id).isEmpty()) {
            cargo = cargoDao.findById(id).get();
            cargoDao.delete(cargo);
            estado = true;
        }
        return estado;
    }

    @Override
    public Cargo findByNombre(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

}
