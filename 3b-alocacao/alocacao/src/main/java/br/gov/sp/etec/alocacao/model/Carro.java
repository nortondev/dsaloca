package br.gov.sp.etec.alocacao.model;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cor;
	private String placa;
	private Long chassi;
	private String modelo;
	
	
	
	public Carro() {

	}
	public Carro(String cor, String placa, Long chassi, String modelo) {
		super();
		this.cor = cor;
		this.placa = placa;
		this.chassi = chassi;
		this.modelo = modelo;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public Long getChassi() {
		return chassi;
	}
	public void setChassi(Long chassi) {
		this.chassi = chassi;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
