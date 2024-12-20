package com.shapeone.shapeone.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_treinos")
public class Treino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O Atributo Nome é Obrigatório!")
	@Size(min = 3, max = 100, message = "O Nome deve ter entre 3 e 100 caracteres")
	private String nome;

	@NotNull(message = "O Atributo Grupo Muscular é Obrigatório!")
	@Size(min = 3, max = 50, message = "O Grupo Muscular deve ter entre 3 e 50 caracteres")
	private String grupoMuscular;

	@NotNull(message = "O Atributo Tipo de Treino é Obrigatório!")
	@Size(min = 3, max = 50, message = "O Tipo de Treino deve ter entre 3 e 50 caracteres")
	private String tipoTreino;

	@NotNull(message = "O Atributo Duração é Obrigatório!")
	@Min(value = 1, message = "O Atributo duração recebe no minimo o valor 1")
	private String duracao;

	@NotNull(message = "O Atributo Status é Obrigatório!")
	@Size(min = 3, max = 20, message = "O Status deve ter entre 3 e 20 caracteres")
	private String status;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	@JsonIgnoreProperties("treino")
	private Usuario usuario;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "treino", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("treino")
	private List<Exercicio> exercicio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGrupoMuscular() {
		return grupoMuscular;
	}

	public void setGrupoMuscular(String grupoMuscular) {
		this.grupoMuscular = grupoMuscular;
	}

	public String getTipoTreino() {
		return tipoTreino;
	}

	public void setTipoTreino(String tipoTreino) {
		this.tipoTreino = tipoTreino;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
