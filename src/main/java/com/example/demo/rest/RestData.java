package com.example.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;

@RestController
@RequestMapping(path = "/rest/dataJR")
public class RestData {

	public List<Persona> personas = new ArrayList<>();
	
	@GetMapping(path = "/obtenDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Persona> getData() {
		
		return personas;		
	}
	
	
	@PostMapping(path = "/introducirDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Persona setData(@RequestBody Persona per) {
		
		
		personas.add(per);
		return per;	
	}
	
	
	@PutMapping(path = "/modificarDatos/{code}",  produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
	public void modificar(@PathVariable Integer code, @RequestBody Persona per) {
		
	
		for(int i =0; i<personas.size();i++) {
			if(personas.get(i).getCode() == code) {
				Persona p = personas.get(i);
				p.setNombre(per.getNombre());
				personas.set(i,p);
				
					
			}
		}
		
		
	}
	
	@DeleteMapping(path = "/borrarDatos/{code}",  produces = MediaType.APPLICATION_JSON_VALUE )
	public void borrar(@PathVariable Integer code) {
		
	
		for(int i =0; i<personas.size();i++) {
			if(personas.get(i).getCode() == code) {				
				personas.remove(i);
					
			}
		}
		
		
	}
	
	
	
		
		
		
		
		
		
		
	
	
	
	
	
	

}
