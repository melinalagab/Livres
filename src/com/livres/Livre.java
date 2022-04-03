package com.livres;

public class Livre {
	private String nom ;
	private int nombrePage ;
	
	
	public Livre(String nom, int nombrePage) {
		super();
		this.nom = nom;
		this.nombrePage = nombrePage; 
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getNombrePage() {
		return nombrePage;
	}


	public void setNombrePage(int nombrePage) {
		this.nombrePage = nombrePage;
	}


	@Override
	public String toString() {
		return "Livre [nom=" + nom + ", nombrePage=" + nombrePage + "]";
	}
	

}
