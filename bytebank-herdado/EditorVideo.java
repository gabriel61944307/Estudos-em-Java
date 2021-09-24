
public class EditorVideo extends Funcionario{
	public double getBonificacao() {
		//super significa que o atributo está definido na classe mãe, a classe que o Gerente herdou
		//é obrigatório utilizar o super na chamada da função, se não ele se comporta como se fosse uma função recursiva
		return 150;
	}
}
