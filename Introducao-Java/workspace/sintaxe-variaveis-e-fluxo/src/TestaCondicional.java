
public class TestaCondicional {
	public static void main(String[] args) {
		// sysout + CTRL + Espaço + enter --> Completa O System.out.println()

		System.out.println("Testando condicionais\n");

		int idade = 12;
		int quantidadePessoas = 2;

		if (idade >= 18) {
			System.out.println("Voce e maior de idade");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voce nao tem 18, mas pode entrar, "
						+ "pois esta acompanhado");
			} else {
				System.out.println("Infelizmente voce nao pode entrar, "
						+ "pois e menor de idade e esta sem acompanhamento");
			}
		}
	}
}
