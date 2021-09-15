public class TestaGeteSet {
	public static void main(String[] args) {
		Conta conta = new Conta(12345, 6789);
		Conta conta1 = new Conta(12345, 6789);
		Conta conta2 = new Conta(12345, 6789);
		Conta conta3 = new Conta(12345, 6789);
		Conta conta4 = new Conta(12345, 6789);
		Conta conta5 = new Conta(12345, 6789);
		System.out.println(conta.getNumero());
		
		
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		conta.setTitular(gabriel);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		System.out.println(conta.getTitular().getProfissao());
		
		System.out.println(Conta.getTotal());
	}
}
