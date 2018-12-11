package br.com.db1.recibo.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.db1.recibo.Pessoa.Pessoa;
import br.com.db1.recibo.cidade.Cidade;

@Entity
@Table(name = "endereco")

public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id", referencedColumnName = "id", nullable = false)
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "cidade_id", referencedColumnName = "id", nullable = false)
	private Cidade cidade;
	
	@Column(name = "nome", length = 60, nullable = false)
	private String logradouro;

	@Column(name = "nome", length = 15, nullable = false)
	private String numero;

	@Column(name = "nome", length = 20, nullable = false)
	private String complemento;

	@Column(name = "nome", length = 8, nullable = false)
	private String cep;

	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo" , length = 20, nullable = false)
	private TipoLogradouro tipoLogradouro;

}
