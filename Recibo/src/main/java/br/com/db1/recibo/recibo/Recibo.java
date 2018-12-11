package br.com.db1.recibo.recibo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import br.com.db1.recibo.Pessoa.Pessoa;

@Entity
@Table(name = "recibo")

public class Recibo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "pessoa_id", referencedColumnName = "id", nullable = false)
	private Pessoa pessoa;

	@ManyToOne
	@JoinColumn(name = "nomeEmitente", referencedColumnName = "emitente", nullable = false)
	private Pessoa emitente;
	
	@Column(name = "valor" , precision = 14)
	private double valorRecibo;

	@Column(name = "data" , nullable = false)
	private LocalDate dataemissao;

}
