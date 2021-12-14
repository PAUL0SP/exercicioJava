package Arrays;

import java.util.Scanner;

public class exercicio1Vetor {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int vet[] = new int [5];
		int maior = 0, x;
		
		
	
		for (x=0;x<5;x++)
		{
			System.out.print("Digite um número: ");
			vet[x]=ler.nextInt();
	
	     }
		for (x=0;x<5;x++)
		{
			System.out.println( vet[x] + "  ");
			if (vet[x] > maior)
			{
				maior = vet[x];
			}	
		}
		System.out.println("O maior digitado é: " + maior);
	}

}
