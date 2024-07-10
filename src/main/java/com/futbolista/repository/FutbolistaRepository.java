package com.futbolista.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.futbolista.entity.futbolista;
import java.util.List;

public interface FutbolistaRepository extends JpaRepository<futbolista, Integer>{
	
	
    //SELECT
	// Método para listar futbolistas por id exacto
    @Query("select f from futbolista f where f.id = ?1")
    public abstract List<futbolista> listaPorIdIgual(int id);
	
  //UPDATE
  	@Query("select e from futbolista e where e.nombres = ?1 and e.apellidos = ?2 and e.id != ?3") 
  	public abstract List<futbolista> actualizaFutbolista(String nombres, String apellidos, int id);
    
}
