package br.com.db1.db1start.aula10;

public class MinhaPrimeiraClasse {

	public static void main(String[] args) {	
		/*System.out.println("Ola Mundo!");
		
		Integer numeroASerVerificado = 3;
		
		
		boolean eVerdade = numeroASerVerificado == 3;
		
		boolean eVerdadeNumeroImpar = numeroASerVerificado % 2 > 0;
		System.out.println(eVerdade);
		System.out.println(eVerdadeNumeroImpar);
}		
*/
		Integer resultaDaSoma = MinhaPrimeiraClasse.somar(1, 10);
		MinhaPrimeiraClasse.imprimirValor(resultaDaSoma);
		
		Integer resultaDaSub = MinhaPrimeiraClasse.sub(40,30);
		MinhaPrimeiraClasse.imprimirValor(resultaDaSub);
		
		Integer resultaDaMult = MinhaPrimeiraClasse.mult(2, 9);
		MinhaPrimeiraClasse.imprimirValor(resultaDaMult);
		
		Integer resultaDaDiv = MinhaPrimeiraClasse.div(10, 5);
		MinhaPrimeiraClasse.imprimirValor(resultaDaDiv);
		
	}	
	
	public static Integer somar(Integer numeroUm, Integer numeroDois) {
		return numeroUm + numeroDois;
		
	}
		
	public static void imprimirValor(Integer valor ) {
		System.out.println(valor);
	}
	
	public static Integer sub(Integer numeroUm, Integer numeroDois) {
		return numeroUm - numeroDois;
	}
	
	public static Integer mult(Integer numeroUm, Integer numeroDois) {
		return numeroUm * numeroDois;
	}
	
	public static Integer div(Integer numeroUm, Integer numeroDois) {
		return numeroUm / numeroDois;
	}
	
} 	
	
