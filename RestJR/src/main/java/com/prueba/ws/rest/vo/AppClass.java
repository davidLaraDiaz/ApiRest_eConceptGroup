package com.prueba.ws.rest.vo;

public class AppClass {

	private String code;
	private String mensaje;
	
	
	
	public AppClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public AppClass(String code, String mensaje) {
		super();
		this.code = code;
		this.mensaje = mensaje;
	}



	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
	
}
