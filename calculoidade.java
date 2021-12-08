package exercicios;

import java.util.Scanner;

public class calculoidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano,mes,dia;
		
		System.out.println("Informe sua idade: ");
		ano = sc.nextInt();
		System.out.println("Informe o mês de nascimento: ");
		mes = sc.nextInt();
		System.out.println("Informe o dia do nascimento: ");
		dia = sc.nextInt();
		
		dia= dia+(ano*365) + (mes*30);
		System.out.println("Você tem " + dia + " dias de idade.");
		

		
	}

}
