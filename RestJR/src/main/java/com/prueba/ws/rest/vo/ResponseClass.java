package com.prueba.ws.rest.vo;

public class ResponseClass {

	private AppClass app;
	private PvClass pv;
	public ResponseClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseClass(AppClass app, PvClass pv) {
		super();
		this.app = app;
		this.pv = pv;
	}
	public AppClass getApp() {
		return app;
	}
	public void setApp(AppClass app) {
		this.app = app;
	}
	public PvClass getPv() {
		return pv;
	}
	public void setPv(PvClass pv) {
		this.pv = pv;
	}
	
	
	
	
	
	
}
