package com.example.demo.model;

import java.io.Serializable;

public class Persona implements Serializable {


	
	private Integer code;
	private String nombre;
	
	public Persona(Integer id, String nombre) {
		
		this.nombre = nombre;
		this.code = id;
		
	}
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
