package com.fgulfodev.invautomotriz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fgulfodev.invautomotriz.entity.Cargo;
import com.fgulfodev.invautomotriz.service.ICargoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/cargo")
public class CargoController {

    @Autowired
    private ICargoService cargoService;

    @GetMapping("/listar")
    public Map<String, Object> listar() {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("listaCargos", cargoService.findAll());
        return datos;
    }

    @GetMapping("/eliminar/{idCargo}")
    public Map<String, Object> eliminar(@PathVariable String idCargo) {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("estado", cargoService.eliminar(Long.parseLong(idCargo)));
        return datos;
    }

    @PostMapping("/crear")
    public Map<String, Object> crear(@RequestBody Cargo cargo) {

        System.out.println("cargo:" + cargo);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("cargo", cargoService.create(cargo));
        return datos;
    }

    @PostMapping("/modificar")
    public Map<String, Object> modificar(@RequestBody Cargo cargo) {

        System.out.println("cargo:" + cargo);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("cargo", cargoService.actualizar(cargo));
        return datos;
    }
}
