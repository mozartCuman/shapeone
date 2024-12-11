package com.shapeone.shapeone.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_exercicios")
public class Exercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "O atributo nome é obrigatório!")
	@Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
	private String nome;

	@NotNull(message = "O atributo repetição é obrigatório!")
	private int repeticao;

	@NotNull(message = "O atributo séries é obrigatório!")
	@Min(value = 1, message = "O Atributo series recebe no minimo o valor 1")
	private int series;

	@NotNull(message = "O atributo tempo de pausa é obrigatório!")
	@Min(value = 1, message = "O Atributo tempoPausa recebe no minimo o valor 1")
	private int tempoPausa;

	@ManyToOne
	@JoinColumn(name = "id_treino", nullable = false)
	@JsonIgnoreProperties("exercicio")
	private Treino treino;

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

	public int getRepeticao() {
		return repeticao;
	}

	public void setRepeticao(int repeticao) {
		this.repeticao = repeticao;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getTempoPausa() {
		return tempoPausa;
	}

	public void setTempoPausa(int tempoPausa) {
		this.tempoPausa = tempoPausa;
	}

	public Treino getTreino() {
		return treino;
	}

	public void setTreino(Treino treino) {
		this.treino = treino;
	}
}