package com.futbolista.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.futbolista.entity.posicion;
import com.futbolista.repository.PosicionRepository;

@Service
public class PosicionServiceImpl implements PosicionService {
	
	 @Autowired
	    private PosicionRepository posicionRepository;

	@Override
	public List<posicion> listarPosiciones() {
		return posicionRepository.findAll();
	}
	

}
