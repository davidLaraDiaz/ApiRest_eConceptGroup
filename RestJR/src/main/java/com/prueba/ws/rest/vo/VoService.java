package com.prueba.ws.rest.vo;

import javax.ws.rs.POST;
import javax.ws.rs.Path;



public class VoService {
	
	private RequestClass Request;
	private ResponseClass Response;
	public VoService() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoService(RequestClass request, ResponseClass response) {
		super();
		Request = request;
		Response = response;
	}
	public RequestClass getRequest() {
		return Request;
	}
	public void setRequest(RequestClass request) {
		Request = request;
	}
	public ResponseClass getResponse() {
		return Response;
	}
	public void setResponse(ResponseClass response) {
		Response = response;
	}


	
	
	
	
	
	
}
