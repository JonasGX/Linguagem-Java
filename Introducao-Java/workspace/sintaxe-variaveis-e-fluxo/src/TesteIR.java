
public class TesteIR {
	public static void main(String[] args) {
		double salario = 4000.0;

		if (salario <= 2600.0) {
			System.out.println("A sua aliquota e de 15%");
			System.out.println("Vocc pode deduzir ate R$ 350");
		} else {
			if (salario <= 3750.0 && salario > 2600.0) {
				System.out.println("A sua aliquota e de 22,5%");
	            System.out.println("Voce pode deduzir ate R$ 636");
			}
		}
	}
}
