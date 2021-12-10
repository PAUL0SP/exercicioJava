package exercicioLacoDecisao;

import java.util.Scanner;

/* 1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/

public class lacosDecisao {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner (System.in);
		
	    System.out.println("Entre com um número: ");
	    int n1 = ler.nextInt();
	    System.out.println("Entre com um número: ");
	    int n2 = ler.nextInt();
	    System.out.println("Entre com um número: ");
	    int n3 = ler.nextInt();		

	    if (n1 > n2 && n1 > n3)
	    {  
	    System.out.println("O maior número é: " + n1);
	    }
	    else if  (n2 > n1 && n2 > n3)
	    {  
	    System.out.println("O maior número é: " + n2);
	    }
	    else
	    {
	    	System.out.println("O maior número é: " + n3);
	    }
	    

	    
	    
	}

}
