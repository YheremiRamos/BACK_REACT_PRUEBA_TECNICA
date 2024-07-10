package com.futbolista.service;

import java.util.List;

import com.futbolista.entity.futbolista;

public interface FutbolistaService {
	
	//select que permite listar todos los futbolistas -- SELECT 
    public abstract List<futbolista> listaTodos();
    
    //Select  que permite filtrar la busqueda por ID -- SELECT (ID)
    public abstract List<futbolista> buscarFutbolistaPorId(int id);
    
    //Registrar Futbolista  -- INSERT
    public abstract futbolista registraFutbolista(futbolista obj);
    
    //Actualizar Futbolista -- UPDATE
    public abstract futbolista actualizaFutbolista(futbolista obj);
    
    //Eliminar Futbolista -- DROP
    public abstract void eliminaFutbolista(int id);
    
}
