package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double salario, valorH, salB, salL;
		int horasT;
		
		
		System.out.println("Digite o número de horas trabalhadas: ");
		horasT = sc.nextInt();
		System.out.println("Digite o valor das horas trabalhadas: ");
		valorH  = sc.nextDouble();
		
		salB = horasT * valorH;
		salL = salB - (salB * 0.3);
		
		System.out.println("O salário do funcionárioserá de: R$" + salL);

	}

}