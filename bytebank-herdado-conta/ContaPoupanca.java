
public class ContaPoupanca extends Conta{
	public ContaPoupanca(int agencia, int numero) {
		// passando agencia e numero para o construtor da classe mãe pois apenas o construtor padrão é herdado automaticamente
		super(agencia, numero);
	}
}
