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

import com.fgulfodev.invautomotriz.entity.Mercancia;
import com.fgulfodev.invautomotriz.service.IMercanciaService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/mercancia")
public class MercanciaController {

    @Autowired
    private IMercanciaService mercanciaService;

    @GetMapping("/listar")
    public Map<String, Object> listar() {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("listaMercancias", mercanciaService.findAll());
        return datos;
    }

    @GetMapping("/eliminar/{idMercancia}")
    public Map<String, Object> eliminar(@PathVariable String idMercancia) {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("estado", mercanciaService.eliminar(Long.parseLong(idMercancia)));
        return datos;
    }

    @PostMapping("/crear")
    public Map<String, Object> crear(@RequestBody Mercancia mercancia) {

        System.out.println("Mercancia:" + mercancia);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("mercancia", mercanciaService.create(mercancia));
        return datos;
    }

    @PostMapping("/modificar")
    public Map<String, Object> modificar(@RequestBody Mercancia mercancia) {

        System.out.println("Mercancia:" + mercancia);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("mercancia", mercanciaService.actualizar(mercancia));
        return datos;
    }
}
