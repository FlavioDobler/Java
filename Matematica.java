package br.com.db1.db1start.aula11;

public class Matematica {
	
	
	//1
	public double verificarNumeroMaior(double numero1, double numero2) {
		if (numero1 > numero2) {
			return numero1;
		} else {
			return numero2;
		}
	}

	
	//2 
	public double verificarNumeroMaiorEntreTresDouble(double numero1, double numero2, double numero3) {
		double maior = numero3;
	       if (numero1 > maior) {
	    	   maior = numero1;
	       }
	       if (numero2 > maior) {
	    	   maior = numero2;
	       }
	       return maior;
    }


	
	//3
	public double verificarMediaDeTresNumeros(double numero1, double numero2, double numero3) {
		double media = 0;
		media = (numero1 + numero2 + numero3) / 3 ;
		return media;
	}
	
	
	
	//4
	public double calcularAreaDeTriangulo(double base, double altura) {
		double area = (base * altura) / 2 ;
		return area;
	}



}