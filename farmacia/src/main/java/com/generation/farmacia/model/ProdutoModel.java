package com.generation.farmacia.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.generation.farmacia.model.CategoriaModel;

@Entity
@Table(name = "tb_produto")
public class ProdutoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O Item deve conter 2 a 100 caracteres e não ter espaço")
	@Size(min = 2, max = 100, message = "O item deve conter no mínimo 02 e no máximo 100 caracteres")
	private String item;
	
	@Size(min = 2, max = 100, message = "O item deve conter no mínimo 02 e no máximo 100 caracteres")
	private String fabricante;
	
	@Positive(message = "Digite um valor maior do que zero")
	private BigDecimal preco;
	
	@NotNull
	private Integer quantidade;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private CategoriaModel categoria;
	

}
