package exerciciosPoo;

public class Cliente {
	
	public String nome;
	char sexo;
	double RG;
	double CPF;
	int idade;
	boolean maior;
	
	public void MaiorIdade()
	{
		maior = true;
	}
	public void Menor()
	{
		maior = false;
	}
	public void Cadastrar()
	{
		if(maior==true)
			System.out.println("Cliente cadastrado com sucesso!");
		else 
			System.out.println("Idade não permitida!");
    }
	public void status()
	{    
		
		System.out.println("Nome do cliente: "+this.nome);
		
		System.out.println("Idade do cliente: "+this.idade);
		
		System.out.println("O cliente é do sexo :"+this.sexo);
		
		System.out.println("Identidade do cliente: "+this.RG);
		
		System.out.println("CPF do cliente: "+this.CPF);
		
		
	}
	
	public String getnome() {
		return nome;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public char getsexo() {
		return sexo;
	}

	public void setRG(double RG) {
		this.RG = RG;
	}

	public double getCPF() {
		return CPF;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	public boolean ismaior() {
		return maior;
	}

	public void setmaior(boolean maior) {
		this.maior = maior;
	}

}

