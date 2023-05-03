
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente(); // Criamos o cliente Paulo
		
		// Instanciamos os valores para o cliente paulo
		paulo.nome = "Paulo Silveira"; 
		paulo.cpf = "222.222.222-22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(250);
		
		System.out.println(contaDoPaulo.getSaldo());
		
		// Realizamos a conexão entre a Classe cliente com a classe Conta
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
		
	}
}
