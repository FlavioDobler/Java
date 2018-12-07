package br.com.db1start.ExercicioInterface;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public String autenticar() {
		return "GERENTE AUTENTICANDO"  ;
	}
	
	@Override
	public Boolean estaLogado() {
		return true;
	}
}
