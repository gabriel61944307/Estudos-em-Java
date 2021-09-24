//Gerente herda da classe Funcionario, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
	private AutenticaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticaoUtil();
	}
	
	public double getBonificacao() {
		//super significa que o atributo está definido na classe mãe, a classe que o Gerente herdou
		//é obrigatório utilizar o super na chamada da função, se não ele se comporta como se fosse uma função recursiva
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
