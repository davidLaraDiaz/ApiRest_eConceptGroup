package com.prueba.ws.rest.vo;

public class PvClass {

	private UsuarioClass usuario;
	private String Rol;
	
	
	
	public PvClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PvClass(UsuarioClass usuario, String rol) {
		super();
		this.usuario = usuario;
		Rol = rol;
	}
	public UsuarioClass getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioClass usuario) {
		this.usuario = usuario;
	}
	public String getRol() {
		return Rol;
	}
	public void setRol(String rol) {
		Rol = rol;
	}
	
	
	
}
