package com.projeto.spring.curso.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idsala;
	private Double numero;
	private String tipo;
	private String descricao;
	public Sala() {
	}
	public Sala(Long idsala, Double numero, String tipo, String descricao) {
		this.idsala = idsala;
		this.numero = numero;
		this.tipo = tipo;
		this.descricao = descricao;
	}
	public Long getIdsala() {
		return idsala;
	}
	public void setIdsala(Long idsala) {
		this.idsala = idsala;
	}
	public Double getNumero() {
		return numero;
	}
	public void setNumero(Double numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
