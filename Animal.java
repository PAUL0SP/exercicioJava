package Herança;

public class Animal {

	private String nome;
	private int idade;
	private int peso;
	private String som;

	public String getSom() {
		return som;
	
	}

	public void setSom(String som) {
		this.som = som;	
	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(nome);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
}