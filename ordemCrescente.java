package exercicioLacoDecisao;

import java.util.Scanner;

public class ordemCrescente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.print("Informe um número: ");
		a = ler.nextInt();
		System.out.print("Informe um número: ");
		b = ler.nextInt();
		System.out.print("Informe um número: ");
		c = ler.nextInt();
		
		if (a < b ) {
			if (b < c) {
				System.out.print( a + "\n" + b + "\n" + c);
			}
			else if (a < c) {
				System.out.print( a + "\n" + c + "\n" + b);
			}
			else {
				System.out.print( c + "\n" + a + "\n" + b);
			}
		}
			
		else if (b < c) {
			if (a < c) {
				System.out.print( b + "\n" + a + "\n" + c);	
			}
			else {
				System.out.print( b + "\n" + c + "\n" + a);
			}
		
		}
		else {
			System.out.print( c + "\n" + b + "\n" + a);
		}
				

	}

}
