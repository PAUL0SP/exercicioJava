    package Heran�a;

    public class Mamiferos extends Animal {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		Cavalo c2 = new Cavalo();
	
		pregui�a p1 = new pregui�a(); 
		
		
		
		System.out.println("\nCachorro");
		c1.setNome("Spyke");
		c1.setIdade(8);
		c1.setPeso(25);
		c1.correr();
		c1.farejar();
		c1.getSom();
		
			System.out.println("\nCavalo");
		c2.setNome("Trov�o");
		c2.setIdade(12);
		c2.setPeso(800);
		c2.correr();
		c2.Comer();
		c2.getSom();
		
		System.out.println("\nPregui�a");
		p1.setNome("kika");
		p1.setIdade(4);
		p1.setPeso(9);
		p1.correr();
		p1.getSom();
	
	}
	
	
	

	
	
	
	   
	
	
	
	
}
