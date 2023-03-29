
public class TesteWhile {
	public static void main(String[] args) {
		int contador = 0;

		while (contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1;
			//contador += 1;
			contador ++; // Contabiliza + 1 na variavel
		}
		System.out.println("valor alocado na variavel: " + contador); // Retorna 11 pois ele verifica se o 11 é menor ou igual a 10]
	}
}
