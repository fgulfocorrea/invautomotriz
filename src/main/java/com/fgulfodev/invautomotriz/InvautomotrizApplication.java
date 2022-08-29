package com.fgulfodev.invautomotriz;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.fgulfodev.invautomotriz.entity.Cargo;
import com.fgulfodev.invautomotriz.service.ICargoService;

@CrossOrigin(origins = "*", maxAge = 3600)
@SpringBootApplication
public class InvautomotrizApplication {

	@Autowired
	private ICargoService cargoService;

	public static void main(String[] args) {
		SpringApplication.run(InvautomotrizApplication.class, args);
	}

	@PostConstruct
	private void init() {
		System.out.println("hola");

		Cargo cargo = new Cargo("Administrador", "Cargo Administrador", 1);
		cargoService.create(cargo);
		cargo = new Cargo("Asesor de Ventas", "Cargo para las funciones de ventas", 1);
		cargoService.create(cargo);
		cargo = new Cargo("Soporte", "Cargo de Soporte", 1);
		cargoService.create(cargo);
	}
}
