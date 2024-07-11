package com.futbolista.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.futbolista.entity.posicion;

public interface PosicionRepository extends JpaRepository<posicion, Integer> {

	
}
