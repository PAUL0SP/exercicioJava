package ExercicioLaços;

import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade=0, idade_21=0, idade_50=0;
		

		while  (idade <90) 
		
		{
			System.out.print("Informe a idade: ");
			idade = sc.nextInt();
			
			if
				(idade !=0) {
				idade = idade+1;
			}
			
			if (idade < 21) {
				idade_21 = idade_21+1;
			}
			if (idade > 50) {
				idade_50 = idade_50+1;
			}
			else idade=-99; {
			break;
			}
		}
		System.out.println("Idade maior que 21: " + idade_21);
		System.out.println("Idade maior que 50: " + idade_50);
	
		
	}

}

	


