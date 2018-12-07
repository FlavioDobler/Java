package br.com.db1start.ExercicioInterface;

public class Cliente implements Autenticavel  {

	@Override
	public String autenticar() {
		return "CLIENTE AUTENTICANDO"  ;
	}
	
	@Override
	public Boolean estaLogado() {
		return true;
	}
}
