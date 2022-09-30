package br.com.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * 
 * 	AllArgsConstructor: cria automaticamente um construtor com todas os atributos da classe como argumento.
	NoArgsConstructor: cria automaticamente um construtor vazio (sem argumentos).
	Data: cria automaticamente os métodos toString, equals, hashCode, getters e setters.
 * 
 * */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Contact {
	
	/* As anotações distrubuidas do lombok facilitam a comunicação entre os pacotes por meio do pacote JPA 
	 * */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome_contato")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	
}
