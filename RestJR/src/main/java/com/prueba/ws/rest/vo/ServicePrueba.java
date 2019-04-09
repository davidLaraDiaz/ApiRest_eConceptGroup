package com.prueba.ws.rest.vo;


import java.awt.PageAttributes.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.json.simple.JSONArray;

import com.prueba.ws.rest.vo.VoService;

@Path("/ServicePrueba")
public class ServicePrueba {
	
	private JSONArray arrayJson;
	
	
	public ServicePrueba() {
		
		arrayJson = new JSONArray();
		cargaJson();
		
	}

	@POST
	@Path("/prueba")
	@Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON})
	public VoService prueba(VoService vo) {
		
		if (vo.getRequest().getPf().getCanal().equals("ECO")) {
			
			UsuarioClass usuario = new UsuarioClass(
					generarId(),
					vo.getRequest().getPv().getUsuario().getName(),
					vo.getRequest().getPv().getUsuario().getPassword(),
					vo.getRequest().getPv().getUsuario().getEmail()
					);
			PvClass pv = new PvClass(usuario, "admin");
			vo.setResponse(new ResponseClass(new AppClass("0000", "Se ha creado un nuevo usuario"), pv));
			arrayJson.add(vo);
		}else{
			vo.setResponse(new ResponseClass(new AppClass("2222", "Error --- Canal No Reconocido ---"), vo.getResponse().getPv()));
		}
		
		return vo;
	}
	
	public String generarId() {
		int id=arrayJson.size() + 1;
		return ""+id;
		
	}
	
	public void cargaJson(){
		
		PfClass pf = new PfClass("ECO", "1234", "20181004", "123", "1.1");
		UsuarioClass usuario = new UsuarioClass("001", "Juan Prueba", "1234", "juan@321");
		PvClass pv = new PvClass(usuario, "Admin");
		RequestClass request = new RequestClass(pf, pv);
		AppClass app = new AppClass("0000", "Se he creado un nuevo usuario");
		ResponseClass response = new ResponseClass(app, pv);
		VoService nuevo = new VoService(request, response);
		
		arrayJson.add(nuevo);
	}
	
	
}
