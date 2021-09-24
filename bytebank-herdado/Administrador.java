//Administrador herda da classe Funcionario, assina o contrato Autenticavel
public class Administrador extends Funcionario implements Autenticavel{
	private AutenticaoUtil autenticador;
	
	public Administrador() {
		this.autenticador = new AutenticaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		return 50;
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
