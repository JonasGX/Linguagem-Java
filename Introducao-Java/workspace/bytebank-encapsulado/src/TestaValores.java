
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		Conta conta2 = new Conta(1337, 13423);
		
		System.out.println(conta.getNumero());
		System.out.println(conta2.getNumero());
		
		System.out.println(Conta.getTotal());
	}
}
