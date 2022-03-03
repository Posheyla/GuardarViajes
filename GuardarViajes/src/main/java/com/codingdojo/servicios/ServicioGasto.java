package com.codingdojo.servicios;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

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
	public Gasto findGasto(Long id) {
		Optional<Gasto> optionalGasto = repositorioGasto.findById(id);
		if(optionalGasto.isPresent()) {
			return optionalGasto.get();
		}
		else {
			return null;
		}
	}
	
	public Gasto updateGasto( Gasto gasto) {
		Optional<Gasto> optionalGasto = repositorioGasto.findById(gasto.getId());
		Gasto aux = optionalGasto.get();
		
		aux.setNombre(gasto.getNombre());
		aux.setTienda(gasto.getTienda());
		aux.setMonto(gasto.getMonto());
		aux.setDescripcion(gasto.getDescripcion());
		
		return repositorioGasto.save(aux);
		
	}
	public Long deleteFromGastos(long id) {
		return repositorioGasto.deleteById(id);
	}

}
