package com.codingdojo.servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.modelos.Gasto;
import com.codingdojo.repositorios.RepositorioGasto;

@Service
public class ServicioGasto {
	private final RepositorioGasto repositorioGasto;
	
	public ServicioGasto(RepositorioGasto repositorio) {
		this.repositorioGasto = repositorio;
	}
	
	public List<Gasto> selectAllFromGastos(){
		return repositorioGasto.findAll();
	}
	
	public Gasto insertIntoGastos( Gasto nuevoGasto) {
		return repositorioGasto.save(nuevoGasto);
	}
	
	public Long deleteFromGastos(long id) {
		return repositorioGasto.deleteById(id);
	}

}
