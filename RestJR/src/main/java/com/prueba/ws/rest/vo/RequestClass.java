package com.prueba.ws.rest.vo;

public class RequestClass {

	private PfClass pf;
	private PvClass pv;
	
	
	public RequestClass() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RequestClass(PfClass pf, PvClass pv) {
		super();
		this.pf = pf;
		this.pv = pv;
	}


	public PfClass getPf() {
		return pf;
	}


	public void setPf(PfClass pf) {
		this.pf = pf;
	}


	public PvClass getPv() {
		return pv;
	}


	public void setPv(PvClass pv) {
		this.pv = pv;
	}
	
	
	
	
}
