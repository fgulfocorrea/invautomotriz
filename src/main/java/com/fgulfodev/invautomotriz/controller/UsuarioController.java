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

import com.fgulfodev.invautomotriz.entity.Usuario;
import com.fgulfodev.invautomotriz.service.IUsuarioService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/listar")
    public Map<String, Object> listar() {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("listaUsuarios", usuarioService.findAll());
        return datos;
    }

    @GetMapping("/eliminar/{idCargo}")
    public Map<String, Object> eliminar(@PathVariable String idCargo) {
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("estado", usuarioService.eliminar(Long.parseLong(idCargo)));
        return datos;
    }

    @PostMapping("/crear")
    public Map<String, Object> crear(@RequestBody Usuario usuario) {

        System.out.println("usuario:" + usuario);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("usuario", usuarioService.create(usuario));
        return datos;
    }

    @PostMapping("/modificar")
    public Map<String, Object> modificar(@RequestBody Usuario usuario) {

        System.out.println("usuario:" + usuario);
        Map<String, Object> datos = new HashMap<String, Object>();
        datos.put("usuario", usuarioService.actualizar(usuario));
        return datos;
    }
}
