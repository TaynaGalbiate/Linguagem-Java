package com.projeto.spring.curso.domain;

public class Turma {

	private Long idturma;
	private String descricao;
	private Long idsala;
	private Long idcurso;
	private String horario;
	public Turma() {
	}
	public Turma(Long idturma, String descricao, Long idsala, Long idcurso, String horario) {
		this.idturma = idturma;
		this.descricao = descricao;
		this.idsala = idsala;
		this.idcurso = idcurso;
		this.horario = horario;
	}
	public Long getIdturma() {
		return idturma;
	}
	public void setIdturma(Long idturma) {
		this.idturma = idturma;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getIdsala() {
		return idsala;
	}
	public void setIdsala(Long idsala) {
		this.idsala = idsala;
	}
	public Long getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(Long idcurso) {
		this.idcurso = idcurso;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
}
