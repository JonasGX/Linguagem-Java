
public class TestaEndereco {
	public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Paulo";
        p.cpf = "111.111.111-22";
        p.idade = 23;
        p.endereco  = new Endereco();
        
        p.endereco.logradouro = "Avenida XYZ";
        System.out.println(p.endereco.logradouro);
    }
}
