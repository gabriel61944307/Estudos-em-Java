
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente gabriel = new Gerente();
		
		gabriel.setNome("Gabriel");
		gabriel.setCpf("123456789-10");
		gabriel.setSalario(1000000.59);
		
		//gabriel.salario = 100;
		
		System.out.println(gabriel.getNome());
		System.out.println(gabriel.getBonificacao());
	}
}
