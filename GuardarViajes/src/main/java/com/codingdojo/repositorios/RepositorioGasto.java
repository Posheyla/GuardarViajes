package com.codingdojo.repositorios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.modelos.Gasto;

@Repository
public interface RepositorioGasto extends CrudRepository<Gasto, Long>{
	//SELECT * FROM usuarios
		List<Gasto> findAll();
		
		//	INSERT INTO usuarios()
		// VALUES()
		@SuppressWarnings("unchecked")
		Gasto save(Gasto nuevoGasto);
		 
		//DELETE FROM usuarios WHERE nombre_usuarios = nombreUsuario
		@Transactional
		Long deleteById(long id);
		
		@Transactional
		Long findById(Integer id);
}
