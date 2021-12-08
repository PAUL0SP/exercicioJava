package exercicios;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custoFabrica, custoCliente;
		System.out.print("Informe o custo de fábrica: ");
		custoFabrica = sc.nextDouble();
		custoCliente = custoFabrica + (custoFabrica * 0.45) + (custoFabrica * 0.28);
		System.out.println("Custo ao consumidor: " + custoCliente);

	}

}
