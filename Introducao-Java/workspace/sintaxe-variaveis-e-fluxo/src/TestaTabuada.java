
public class TestaTabuada {
	public static void main(String[] args) {

		for(int multiplicador = 1 ; multiplicador <= 10 ; multiplicador ++) {
			for(int contador = 1; contador <= 10; contador ++) {
				int calculo = multiplicador * contador;
				System.out.println(multiplicador+ " x "+ contador+ " = "+ calculo);
			}
			System.out.println();
		}
	}
}
