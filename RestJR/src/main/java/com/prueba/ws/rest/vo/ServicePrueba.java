package com.prueba.ws.rest.vo;


import java.awt.PageAttributes.MediaType;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.prueba.ws.rest.vo.VoService;

@Path("/ServicePrueba")
public class ServicePrueba {

	@POST
	@Path("/prueba")
	@Consumes({javax.ws.rs.core.MediaType.APPLICATION_JSON})
	@Produces({javax.ws.rs.core.MediaType.APPLICATION_JSON})
	public VoService prueba(VoService vo) {
		
		if (vo.getRequest().getPf().getCanal().equals("ECO")) {
			vo.setResponse(new ResponseClass(new AppClass("0000", "Se ha creado un nuevo usuario"), vo.getResponse().getPv()));
		}else{
			vo.setResponse(new ResponseClass(new AppClass("2222", "Error --- Canal No Reconocido ---"), vo.getResponse().getPv()));
		}
		
		return vo;
	}
	
	
}
