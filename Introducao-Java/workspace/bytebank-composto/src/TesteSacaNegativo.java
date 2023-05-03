public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		// Colocando a variavel saldo PRIVATE e acessando fora da classe da maneira correta
		
		System.out.println(conta.saca(101));
		
		conta.saca(101);
		
		System.out.println(conta.getSaldo());
		
		
		
		
	}
}
