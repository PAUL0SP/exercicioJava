package ExercicioLaços;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int numero = 0;
		int soma = 0;
		
	do {
		
		System.out.print("Digite um númeto: ");
		
			numero = ler.nextInt();
		    soma+=numero;
	}
	while (numero!=0);
System.out.println("A soma dos números digitados é: " + soma );
	}
}
