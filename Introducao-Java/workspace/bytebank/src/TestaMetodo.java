
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 250;
		contaDoPaulo.deposita(250);
		
		System.out.println("Saldo do Paulo: R$" + contaDoPaulo .saldo);
		
		
		System.out.println("Saldo do Paulo: R$" + contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(250);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(100, contaDoPaulo);

		if(sucessoTransferencia) {
			System.out.println("\nTransferencia com sucesso!!");
		}else {
			System.out.println("\nTranseferencia nao realizada");
		}
		System.out.println("\nSaldo da Marcela: R$" + contaDaMarcela.saldo);
		System.out.println("Saldo do Paulo: R$" + contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "\nPaulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
	}
}
