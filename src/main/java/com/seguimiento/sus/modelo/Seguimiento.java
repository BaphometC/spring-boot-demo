package com.seguimiento.sus.modelo;

import javax.persistence.*;

@Entity
@Table(name="sus")
public class Seguimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;
	private float numero;

	public Seguimiento(Integer id, String nombre, float numero) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public Seguimiento(String nombre, float numero) {
		super();
		this.nombre = nombre;
		this.numero = numero;
	}
	
	public Seguimiento() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}
	
	

}
