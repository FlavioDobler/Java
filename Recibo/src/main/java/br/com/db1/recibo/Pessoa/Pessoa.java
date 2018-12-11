package br.com.db1.recibo.Pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoa")

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "nome", length = 60, nullable = false)
	private String nome;

	@Column(name= "emitente", length = 60, nullable = false)
	private String emitente;
	
	@Column(name= "prestador", length = 60, nullable = false)
	private String prestador;
	
	
	@Column(name = "documento", length = 20, nullable = false)
	private int documento;

	@Enumerated(EnumType.STRING)
	private TipoDocumento tipodocumento;

}
