
public class Conta{
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		//System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando conta com agencia: " + agencia + " e numero: " + numero);
	}
	
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		else
			return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valores negativos não são aceitos como agencia");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Valores negativos não são aceitos como numero");
			return;
		}
		this.numero = numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}
