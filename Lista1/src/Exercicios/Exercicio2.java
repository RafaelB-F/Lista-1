package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salMin, kw, kwVal, total;
		
		System.out.println("Digite o valor do salário mínimo e a quantidade de KW: ");
		salMin = sc.nextDouble();
		kw = sc.nextDouble();
		
		kwVal = salMin * 0.01;
		
		total = kwVal * kw;
		System.out.println("O valor do KW é: R$" + kwVal );
		System.out.println("O total a ser pago é: R$" + total);
	}

}