package br.com.db1start.ExercicioInterface;

public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		return "DIRETOR AUTENTICANDO"  ;
	}
	
	@Override
	public Boolean estaLogado() {
		return true;
	}
}
	
	
	
	

