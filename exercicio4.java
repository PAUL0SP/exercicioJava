package exercicios;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,d,r,s;
		System.out.println("Informe um valor positivo de A: ");
		a = sc.nextInt();
		System.out.println("Informe um valor positivo de B: ");
		b = sc.nextInt();
		System.out.println("Informe um valor positivo de C:");
		c = sc.nextInt();
		
		r = (a + b) * (a + b);

		s = (b + c) * (b + c);
		
		d = (r+s)/2;
		
		System.out.println("O valor final é:" + d);


		
	

	}

}
