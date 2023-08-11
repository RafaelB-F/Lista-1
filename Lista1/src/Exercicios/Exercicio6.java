package Exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int val = 0;
		int fat = 1;
		
		System.out.println("Digite o valor que deseja calcular seu fatorial:");
		val = sc.nextInt();
		
		
		for (int i = 1; i <= val; i++) {
			
			fat *= i;
			
		
		}
		System.out.println("fatorial de " + val + ": " + fat);

	}

}
