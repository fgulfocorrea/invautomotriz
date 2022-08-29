package com.fgulfodev.invautomotriz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgulfodev.invautomotriz.entity.Mercancia;

@Repository
public interface IMercanciaDao extends JpaRepository<Mercancia, Long> {

}
