
public class TestaCondicional02 {
	public static void main(String[] args) {
		// sysout + CTRL + Espaço + enter --> Completa O System.out.println()

		System.out.println("Testando condicionais\n");

		int idade = 12;
		int quantidadePessoas = 2;
		//boolean acompanhado = true;
		boolean acompanhado = quantidadePessoas > 1;

		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo!!");
		} else {
			System.out.println("Infelizmente voce nao pode entrar, "
					+ "pois e menor de idade e esta sem acompanhamento");
		}
	}
}
