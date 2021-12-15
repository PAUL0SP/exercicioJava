package exerciciosPoo;


public class objetoCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente();
		
		c1.nome="Paulo";
		c1.idade=30;
		c1.sexo='M';
		c1.RG=12345678.9;
		c1.CPF=987654321.01;
		c1.MaiorIdade();
		c1.status();
		c1.Cadastrar();
		
		
		System.out.println("\n");
		
		
	
	}
	
}
