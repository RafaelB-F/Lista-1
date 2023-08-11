package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c;

		System.out.println("Digite os respectivos ângulos do triângulo: A, B, C.");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a + b + c == 180) {

			if ((a == 90 && b < 90 && c < 90) || (b == 90 && a < 90 && c < 90) || (c == 90 && b < 90 && a < 90)) {
				System.out.println("TRIÂNGULO RETÂNGULO");
			} else if ((a > 90 && b < 90 && c < 90) || (b > 90 && a < 90 && c < 90) || (c > 90 && b < 90 && a < 90)) {
				System.out.println("TRIÂNGULO OBTUSÂNGULO");
			} else if ((a < 90 && b < 90 && c < 90)) {
				System.out.println("TRIÂNGULO ACUTÂNGULO");
			}
			
			if(a == b && a == c) {
				System.out.println("EQUILÁTERO");
			}else if(a != b && a != c && c != b) {
				System.out.println("ESCALENO");
			}else if(a == b || b == c || c == a) {
				System.out.println("ISÓSCELES");
			}

		} else {
			System.out.println("não é triângulo");
		}

	}
}