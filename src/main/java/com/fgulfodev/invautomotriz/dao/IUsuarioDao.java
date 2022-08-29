package com.fgulfodev.invautomotriz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgulfodev.invautomotriz.entity.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
