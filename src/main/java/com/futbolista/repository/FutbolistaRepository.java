package com.futbolista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.futbolista.entity.futbolista;
import java.util.List;

public interface FutbolistaRepository extends JpaRepository<futbolista, Integer>{
	
	public abstract List<futbolista> findByOrderByNombresAsc();
	

    // Método para listar futbolistas por id exacto
    @Query("select f from futbolista f where f.id = ?1")
    public abstract List<futbolista> listaPorIdIgual(int id);
	
}
