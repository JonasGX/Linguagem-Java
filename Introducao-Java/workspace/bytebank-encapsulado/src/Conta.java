public class Conta{
	// Lemos essas variaveis como atributos
	// se chamarmos o objeto ele vai retorar 0 para numeros e null para strings
	
	private double saldo; // private nao pode ser acessado fora da classe Conta
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total; // Funciona como uma variavel global é pertencente a classe conta
	
	// Quando é chamado por padrão se cria um construtor Conta() sem que esteja no codigo
	public Conta(int agencia, int numero) {
		Conta.total += 1;
		//System.out.println("O total de contas e de: " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Criando uma contra construtor " + this.numero);
	} 
	
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
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Nao pode valor menor igual a 0");
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia; 
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 0 ) {
			System.out.println("Nao pode valor menor igual a 0");
			return; // Para quando chegar aqui travar o processo
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
}

 