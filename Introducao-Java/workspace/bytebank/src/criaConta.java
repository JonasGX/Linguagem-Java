
public class criaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();

		primeiraConta.saldo = 200;
		primeiraConta.saldo += 100;
		//System.out.println(primeiraConta.saldo);

		segundaConta.saldo = 50;
		//System.out.println(segundaConta.saldo);
		
		System.out.println("Primeira conta tem " + primeiraConta.saldo);
		System.out.println("Segunda conta tem " + segundaConta.saldo);
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		System.out.println(segundaConta.agencia);
		
		segundaConta.agencia = 146; 
		
		System.out.println("Agora a segunda conta esta "
				+ "na agencia numero: " + segundaConta.agencia);
		
	}
}
