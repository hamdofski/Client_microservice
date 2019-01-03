package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


 @Entity
public class Client implements Serializable {
	 
	 @Id @GeneratedValue
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String Rue;
	private double codePostale;
	private String ville;
	private String paye;
	
	public Client(String nomClient, String prenomClient, String rue, double codePostale, String ville, String paye) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		Rue = rue;
		this.codePostale = codePostale;
		this.ville = ville;
		this.paye = paye;
	}
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idCient) {
		this.idClient = idCient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getRue() {
		return Rue;
	}
	public void setRue(String rue) {
		Rue = rue;
	}
	public double getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(double codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPaye() {
		return paye;
	}
	public void setPaye(String paye) {
		this.paye = paye;
	}
	
	
	
	
	
	
}
