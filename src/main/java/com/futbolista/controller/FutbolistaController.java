package com.futbolista.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.futbolista.entity.futbolista;
import com.futbolista.service.FutbolistaService;
import com.futbolista.util.AppSettings;

@RestController
@RequestMapping("/url/futbolista")
@CrossOrigin(origins = AppSettings.URL_CROSS_ORIGIN)
public class FutbolistaController {

	@Autowired
	private FutbolistaService futbolistaService;
	

    @GetMapping
    @ResponseBody
    public List<futbolista> getAllFutbolistas() {
        return futbolistaService.listaTodos();
    }

    @GetMapping("/buscarPorId/{id}")
    @ResponseBody
    public List<futbolista> buscarFutbolistaPorId(@PathVariable Integer id) {
        return futbolistaService.buscarFutbolistaPorId(id);
    }


    @GetMapping("/ordenados")
    @ResponseBody
    public List<futbolista> getFutbolistasOrdenadosPorNombres() {
        return futbolistaService.getFutbolistasOrdenadosPorNombres();
    }
}
