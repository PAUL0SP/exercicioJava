package exercicioLacoDecisao;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i;
		
		
		System.out.printf("Informe sua Idade: ");
		i = ler.nextInt();
		if (i >= 10 && i <= 14)
		{
		System.out.printf("\nInfantil");
		}
		else if (i >= 15 &&  i <= 17)
		{
		System.out.printf("\nJuvenil");
		}
		else if (i >= 18 && i <=25 )
		{
			System.out.printf("\nAdulto");
		}
		else
		{ 
			System.out.println("Idade não autorizada.");
		}
		}
		
		
		
		

	}


