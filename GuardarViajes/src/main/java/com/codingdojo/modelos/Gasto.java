package com.codingdojo.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "gastos")
public class Gasto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size( min = 5, max = 40, message = "El nombre debe tene entre 5 y 40 caracteres")
	private String nombre;
	
	@NotNull
	@Size( min = 5, max = 40, message = "La tienda debe tene entre 5 y 40 caracteres")
	private String tienda;
	
	@NotNull
	private Integer monto;
	
	@NotNull
	@Size( min = 5, max = 200, message = "La descripcion debe tene entre 5 y 200 caracteres")
	private String descripcion;
	
	public Gasto() {
		
	}

	public Gasto(long id,String nombre,String tienda, int monto, String descripcion) {
		
		this.id = id;
		this.nombre = nombre;
		this.tienda = tienda;
		this.monto = monto;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTienda() {
		return tienda;
	}

	public void setTienda(String tienda) {
		this.tienda = tienda;
	}

	public Integer getMonto() {
		return monto;
	}

	public void setMonto(Integer monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
