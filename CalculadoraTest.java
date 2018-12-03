package br.com.db1.db1start.aula11;

import org.junit.Test;
import org.junit.Assert;

public class CalculadoraTest {
	
	@Test
	public void deveRetornarSomaDeDoisNumeros() {
		Calculadora soma = new Calculadora();
		int somaDeValores = soma.calcularSoma(1, 2);
    	Assert.assertEquals(3, somaDeValores); 	
	}

	@Test
	public void deveRetornarSubDeDoisNumeros() {
		Calculadora sub = new Calculadora();
		int subDeValores = sub.calcularSub(50,25);
		Assert.assertEquals(25, subDeValores);
	}

	@Test 
	public void deveRetornarMultDeDoisNumeros() {
		Calculadora mult = new Calculadora();
		int multDeValores = mult.calcularMult(6,6);
		Assert.assertEquals(36, multDeValores);
	}

	
	@Test 
	public void deveRetornarDivDeDoisNumeros() {
		Calculadora div = new Calculadora();
		int divDeValores = div.calcularDiv(100,50);
		Assert.assertEquals(2, divDeValores);
	}

	@Test 
	public void deveVerificarPar() {
		Calculadora par = new Calculadora();
		boolean verifPar = par.numeroPar(2);
		Assert.assertTrue(verifPar);
	}
		
		@Test 
	public void deveVerificarImpar() {
		Calculadora impar = new Calculadora();
		boolean verifImpar = impar.numeroPar(3);
		Assert.assertFalse(verifImpar);
		}
	
	
	@Test 
	public void deveVerificarMaior() {
		Calculadora maior = new Calculadora();
		int numeroMaior = maior.numeroMaior(10, 5);
		Assert.assertEquals(10, numeroMaior);
	}
	
	@Test
	public void deveVerificarQauntidadeImpar() {
		Calculadora impar = new Calculadora();
		int numeroImpar = impar.numeroImpar(1);
		Assert.assertEquals(50, numeroImpar);
	}
	






}

