public class Conta{
	// Lemos essas variaveis como atributos

	double saldo; // se chamarmos o objeto ele vai retorar 0 para numeros e null para strings
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor; 
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false; 
		} 
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false; 
	}
}

 