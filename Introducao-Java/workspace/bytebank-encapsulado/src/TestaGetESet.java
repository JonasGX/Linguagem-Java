
public class TestaGetESet {
	public static void main(String[] args) {
		Conta contaJonas = new Conta(1337, 1456);
		Cliente clientejonas = new Cliente();
		// conta.numero = 1337; nao compila pois o atributo é privado

		contaJonas.setTitular(clientejonas);
		
		clientejonas.setNome("Jonas Gomes Xavier");
		clientejonas.setCpf("123.456.789-10");
		clientejonas.setProfissao("Programador");

		System.out.println(contaJonas.getNumero());
		System.out.println(contaJonas.getTitular().getNome());
		System.out.println(contaJonas.getTitular().getCpf());
		System.out.println(contaJonas.getTitular().getProfissao());

		

	}
}
