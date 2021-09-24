//public = visivel para todos
//protected = visivel para a propria classe e as classes filhas
//private = visivel apenas para a propria classe


//abstract quer dizer que não é possivel instanciar objetos desta classe
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	//método sem corpo, obrigatório ser implementado nos filhos
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
