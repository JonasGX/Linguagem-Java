
public class criaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.numero = 9;
		primeiraConta.agencia = 001;
		primeiraConta.titular = "Jonas";
		
		System.out.println(primeiraConta.titular);
	}
}
