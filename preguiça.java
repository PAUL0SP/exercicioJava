package Herança;

public class preguiça extends Animal {
	
	public void correr() {
		System.out.println("A preguiça não corre! ");
	}
	public void subir() {
		System.out.println("A preguiça esta subindo na árvore! ");
		
		this.getSom();
		System.out.println("Bocejando");
	}

}
