//Gerente herda da classe Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaoUtil();
	}
	
	public double getBonificacao() {
		//super significa que o atributo est� definido na classe m�e, a classe que o Gerente herdou
		//� obrigat�rio utilizar o super na chamada da fun��o, se n�o ele se comporta como se fosse uma fun��o recursiva
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
