
public class TesteGerente {
	public static void main(String[] args) {
		Autenticavel referencia = new Cliente(); 
		
		
		Gerente g1 = new Gerente();
		g1.setNome("Lucas");
		g1.setCpf("123456789-10");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		
		
		g1.setSenha(12345);
		boolean autenticou = g1.autentica(12345);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
	}
}
