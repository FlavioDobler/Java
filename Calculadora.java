package br.com.db1.db1start.aula11;

public class Calculadora {
	//Soma
	public int calcularSoma(int numero1, int numero2) {
		int soma = numero1 + numero2;
		return soma;
	}

	//Sub
	public int calcularSub(int numero1, int numero2) {
		int sub = numero1 - numero2;
		return sub;
	}
	
	//Mult
	public int calcularMult(int numero1, int numero2) {
		int mult = numero1 * numero2;
		return mult;
	}

	//Divisao
	public int calcularDiv(int numero1, int numero2) {
		int div = numero1 / numero2;
		return div;
	}
	
	
	//Numero Par
	public boolean numeroPar(int  numero1) {
		if (numero1 % 2 == 0) {
		return true;
		} else {
			return false;
		}
	}
	
	//Numero Maior
	public int numeroMaior(int numero1, int numero2) {
		if (numero1>numero2) {
		return numero1;
		} else {
			return numero2;
		}
	}
	
	//Numero Impar 
	public int numeroImpar(int numero1) {
		int aux = 0;
		 for(int i=numero1 ;  i<=100; i++){
			 if ( (i % 2) != 0) {
				 aux++;		 
			 }
		 }
		return aux;
	}

}
