
public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		//super significa que o atributo est� definido na classe m�e, a classe que o Gerente herdou
		//� obrigat�rio utilizar o super na chamada da fun��o, se n�o ele se comporta como se fosse uma fun��o recursiva
		return 150;
	}
}
