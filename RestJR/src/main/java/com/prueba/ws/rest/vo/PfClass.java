package com.prueba.ws.rest.vo;

public class PfClass {
	
	private String canal;
	private String codigotrs;
	private String date;
	private String idService;
	private String vrs;
	
	
	
	public PfClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PfClass(String canal, String codigotrs, String date, String idService, String vrs) {
		super();
		this.canal = canal;
		this.codigotrs = codigotrs;
		this.date = date;
		this.idService = idService;
		this.vrs = vrs;
	}
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getCodigotrs() {
		return codigotrs;
	}
	public void setCodigotrs(String codigotrs) {
		this.codigotrs = codigotrs;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIdService() {
		return idService;
	}
	public void setIdService(String idService) {
		this.idService = idService;
	}
	public String getVrs() {
		return vrs;
	}
	public void setVrs(String vrs) {
		this.vrs = vrs;
	}
	
	

}
