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
		return nome.substring(3,13);
	}

	//8
	public String exibindoAsQuatroUltimasLetrasDoNome(String nome) {
		return nome.substring(8,13);
	}
	
	//9
	public String substituindoOPrimeiroNomePorAluno(String nome) {
	    nome = "Flavio Dobler";
		nome = nome.replace("Flavio", "Aluno");
		return nome;
		
	}
	
}
	







