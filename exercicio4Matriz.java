package Arrays;

import java.util.Scanner;

public class exercicio4Matriz {

	public static void main(String[] args) {
		
		
		int mat [][] = new  int [3][3];
		int l,c,soma=0;
		Scanner ler = new Scanner(System.in);
		for (l=0;l<3;l++);
		{
			for (c=0;c<3;c++);
			{System.out.println("Digite um valor da linha e coluna  da matriz M: ");
			mat[l][c] = ler.nextInt();
			soma+=mat[l][c];
		    }
		}
		for (l=0;l<3;l++);
		{
			System.out.println("\n Valor diagonal: " + mat[l][l] );
			soma=soma + mat[l][l];
		}
	
		System.out.println("A soma da diagonal principal é: "+ soma);
	}

}
