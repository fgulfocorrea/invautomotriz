package com.fgulfodev.invautomotriz.service;

import java.util.List;

import com.fgulfodev.invautomotriz.entity.Cargo;

public interface ICargoService {

    public List<Cargo> findAll();

    public Cargo create(Cargo cargo);

    public Cargo actualizar(Cargo cargo);

    public boolean eliminar(Long id);

    public Cargo findByNombre(String nombre);
}
