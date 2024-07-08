package com.futbolista.service;

import java.util.List;

import com.futbolista.entity.futbolista;

public interface FutbolistaService {
	
    List<futbolista> listaTodos();
    List<futbolista> buscarFutbolistaPorId(Integer id);
    List<futbolista> getFutbolistasOrdenadosPorNombres();
	
}
