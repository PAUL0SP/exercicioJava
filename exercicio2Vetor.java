package Arrays;

import java.util.Scanner;

public class exercicio2Vetor {

	public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
		
		int vet[] = new int [10];
		int x,maior=0,soma=0,r=0;
	    int media = 0;
		for (x=0;x<10;x++)
		{
			System.out.print("Informe o valor obtido: ");
			vet[x]=ler.nextInt();
			soma=soma+vet[x];
			media=soma/10;
	
		if (vet[x] ==6 )
		{
			 maior++;
		}
			
		} 
		System.out.print("\nA maior pontua��o apareceu: "+maior+" Vezes.");
		
		System.out.print("\nA m�dia �: "+ media);

	}
	 
}

