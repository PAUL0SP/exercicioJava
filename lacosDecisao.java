package exercicioLacoDecisao;

import java.util.Scanner;

/* 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class lacosDecisao {

	public static void main(String[] args) {
		
		
		Scanner ler = new Scanner (System.in);
		
	    System.out.println("Entre com um n�mero: ");
	    int n1 = ler.nextInt();
	    System.out.println("Entre com um n�mero: ");
	    int n2 = ler.nextInt();
	    System.out.println("Entre com um n�mero: ");
	    int n3 = ler.nextInt();		

	    if (n1 > n2 && n1 > n3)
	    {  
	    System.out.println("O maior n�mero �: " + n1);
	    }
	    else if  (n2 > n1 && n2 > n3)
	    {  
	    System.out.println("O maior n�mero �: " + n2);
	    }
	    else
	    {
	    	System.out.println("O maior n�mero �: " + n3);
	    }
	    

	    
	    
	}

}
