package br.com.db1.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class NomeTest {
	
	@Test
	public void deveTransformarParaLetraMaiuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMaiuscula("flavio dobler");
		Assert.assertEquals("FLAVIO DOBLER", valorTransformado);
	}
	
	@Test
	public void deveTransformarParaLetraMinuscula() {
		Nome nome = new Nome();
		String valorTransformado = nome.transformarParaLetraMinuscula("FLAVIO DOBLER");
		Assert.assertEquals("flavio dobler", valorTransformado);
	}
	
	
	
	@Test
	public void deveRetornarTamanhoDoNome() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoDoNome("DB1START");
		Assert.assertEquals(8, tamanhoDoNome);
	}


	@Test
	public void deveRetornarTamanhoDaPalavra() {
		Nome nome = new Nome();
		int tamanhoDaPalavra = nome.tamanhoDaPalavra(" DB1START ");
		Assert.assertEquals(8, tamanhoDaPalavra);		
	}

	@Test
	public void deveRetornarOMesmoTamanhoDaTres() {
		Nome nome = new Nome();
		int tamanhoDoNome = nome.tamanhoComparacao(" DB1START ");
		Assert.assertEquals(8,tamanhoDoNome);
	}

	
	@Test 
	public void deveRetornarAsPrimeirasLetrasDoNome() {
		Nome nome = new Nome ();
		String primeirasLetras = nome.primeirasLetrasDoNome("Maiko Cunha");
		Assert.assertEquals("Maik", primeirasLetras);
	}

	@Test
	public void deveRetornarAPartirDaTerceiraLetraDoNome() {
		Nome nome = new Nome ();
		String letrasAPartirDoTerceiro = nome.exibindoAPartirDaTerceiraLetraDoNome("Maiko Cunha");
		Assert.assertEquals("ko Cunha", letrasAPartirDoTerceiro);
	}

	@Test 
	public void deveRetornarAsUltimasLetrasDoNome() {
		Nome nome = new Nome ();
		String ultimasLetrasDoNome = nome.exibindoAsQuatroUltimasLetrasDoNome("Maiko Cunha");
		Assert.assertEquals("unha", ultimasLetrasDoNome);
	}
	
	@Test
	public void deveRetornarAlunoNoLugarDoPrimeiroNome() {
		Nome nome = new Nome ();
		String primeiroNomeSubstituido = nome.substituindoOPrimeiroNomePorAluno("Maiko Cunha");
		Assert.assertEquals("Aluno Cunha", primeiroNomeSubstituido);
	}

	@Test
	public void deveRetornarStringSeparada() {
		Nome nome = new Nome ();
		String[] palavrasSeparadas = nome.exibindoPalavrasSeparadamente("banana, maçã, melancia");
		String[] palavraEsperada = {"banana","maçã","melancia"};
		Assert.assertEquals(palavraEsperada, palavrasSeparadas);
	}

	@Test
	public void deveRetornarQuantidadeDeVogais() {
		Nome nome = new Nome ();
		int quantidadeDeVogais = nome.exibindoQuantidadeDeVogais("MAiko");
		Assert.assertEquals(3,quantidadeDeVogais);
	}
	
	@Test
	public void deveRetornarStringInversa() {
		Nome nome = new Nome ();
		String palavraInversa = nome.exibindoPalavraContrario("Maiko");
		Assert.assertEquals("okiaM",palavraInversa);
	}

}
