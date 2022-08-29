package com.fgulfodev.invautomotriz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fgulfodev.invautomotriz.entity.Cargo;

@Repository
public interface ICargoDao extends JpaRepository<Cargo, Long> {

}
