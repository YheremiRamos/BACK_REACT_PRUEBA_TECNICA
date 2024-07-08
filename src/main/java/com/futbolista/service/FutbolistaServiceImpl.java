package com.futbolista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futbolista.entity.futbolista;
import com.futbolista.repository.FutbolistaRepository;

@Service
public class FutbolistaServiceImpl implements FutbolistaService{

	 	@Autowired
	    private FutbolistaRepository futbolistaRepository;

	 	@Override
	    public List<futbolista> listaTodos() {
	        return futbolistaRepository.findAll();
	    }

	    @Override
	    public List<futbolista> buscarFutbolistaPorId(Integer id) {
	        return futbolistaRepository.listaPorIdIgual(id);
	    }

		@Override
		public List<futbolista> getFutbolistasOrdenadosPorNombres() {
			return futbolistaRepository.findByOrderByNombresAsc();
		}

}
