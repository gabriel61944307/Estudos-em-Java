//Uma interface n�o pode ter nada concreto, tudo nela � abstrato

//Contrato autenticavel
//quem assinar esse contrato, precisa implementar
//metodo setSenha
//metodo autentica
public abstract interface Autenticavel{
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
}
