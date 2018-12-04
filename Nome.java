package br.com.db1.db1start.aula11;

public class Nome {
	//1
	public String transformarParaLetraMaiuscula(String nome) {
		return nome.toUpperCase();
	}
	
	//2
	public String transformarParaLetraMinuscula(String nome) {
		return nome.toLowerCase();
	}
	
	//3
	public int tamanhoDoNome(String nome) {
		return nome.length();
	}
	
	//4
	public int tamanhoDaPalavra(String palavra) {
		palavra = palavra.replaceAll(" ", "");
        return palavra.length();
	}

	//5
	public int tamanhoComparacao(String nome) {
		nome = nome.replaceAll(" ", "");
		return nome.length();
	}

	//6
	public String primeirasLetrasDoNome(String nome) {
		return nome.substring(0,4);
	}

	//7
	public String exibindoAPartirDaTerceiraLetraDoNome(String nome) {
		int numeroDeCaracteres = nome.length();
		nome = nome.substring(3,numeroDeCaracteres);
		return nome;
	}

	//8
	public String exibindoAsQuatroUltimasLetrasDoNome(String nome) {
		int numeroDeCaracteres = nome.length();
		int caracteresMenosQuatro = numeroDeCaracteres - 4;
		nome = nome.substring(caracteresMenosQuatro, numeroDeCaracteres );
		return nome;
	}
	
	//9
	public String substituindoOPrimeiroNomePorAluno(String nome) {
		String[] nomeSeparado = nome.split(" ");
		nomeSeparado[0]= "Aluno";
		nome = nome.join(" ", nomeSeparado);
		return nome;
	}
	
	//10
	public String[] exibindoPalavrasSeparadamente(String palavra) {
		String[] palavraSeparada = palavra.split(", ");
		for (int i = 0; i < palavraSeparada.length; i++) {
			System.out.println(palavraSeparada[i]);
		}
		return palavraSeparada;
	}
	
	//11	
	public int exibindoQuantidadeDeVogais(String texto) {
		int totalvogais = 0;
		texto = texto.toLowerCase();
		for (int i = 0; i < texto.length(); i++) {
	            char c = texto.charAt(i);
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                totalvogais++;
	            }
	        }
	        return totalvogais;
	}
	
	//12 
	public String exibindoPalavraContrario(String palavra) {
		String inversa = "";
	    for (int i = palavra.length() - 1; i >= 0; i--)
	      inversa += palavra.charAt(i);
	    return inversa;
	  }

}
	
	


	







