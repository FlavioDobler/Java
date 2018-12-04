package br.com.db1.db1start.aula11;

import org.junit.Assert;
import org.junit.Test;

public class MatematicaTest {

	@Test
	public void deveRetornarNumeroDoubleMaior () {
		Matematica maior = new Matematica();
		double numeroMaior = maior.verificarNumeroMaior(50.0, 100.0d);
		Assert.assertEquals(100.0, numeroMaior, 0.001);
	}
	
	@Test
	public void deveRetornarMaiorEntreTresNumeros () {
		Matematica maiordetres = new Matematica();
		double maiorDeTres = maiordetres.verificarNumeroMaiorEntreTresDouble(10.0, 25.0, 20.0);
		Assert.assertEquals(25.0, maiorDeTres, 0.001);
	}
	
	@Test
	public void deveRetornarMediaEntreTresNumeros () {
		Matematica media = new Matematica();
		double mediaDeTresNumeros = media.verificarMediaDeTresNumeros(50.0, 100.0, 55.2);
		Assert.assertEquals(68.4, mediaDeTresNumeros, 0.001);
	}
	
	@Test
	public void deveRetornarAreaDoTriangulo () {
		Matematica areatriangulo = new Matematica();
		double areaDeTriangulo = areatriangulo.calcularAreaDeTriangulo(5.00, 10.00);
		Assert.assertEquals(25.00, areaDeTriangulo, 0.001);		
	}
	
}
