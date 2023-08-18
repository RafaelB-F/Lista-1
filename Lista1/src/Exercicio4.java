package Exercicios;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod, qtd;
		double total = 0, val_descontado = 0;

		System.out.println("Digite o código e quantidade do produto comprado: ");
		cod = sc.nextInt();
		qtd = sc.nextInt();

		if (cod >= 1 && cod <= 10) {
			System.out.println("Preço unitário: R$10,00");
			total = qtd * 10;
		} else if (cod >= 11 && cod <= 20) {
			System.out.println("Preço unitário: R$15,00");
			total = qtd * 15;
		} else if (cod >= 21 && cod <= 30) {
			System.out.println("Preço unitário: R$20,00");
			total = qtd * 20;
		} else if (cod >= 31 && cod <= 40) {
			System.out.println("Preço unitário: R$40,00");
			total = qtd * 40;
		}
		 System.out.println("Valor total sem desconto: R$" + total);
		 
		 if(total <= 250) {
			 val_descontado = total - total * 0.05;
			 System.out.println("Desconto aplicado: 5%");
		 } 
		 else if(total > 250 && total <= 500) {
			 val_descontado =  total - total * 0.1;
			 System.out.println("Desconto aplicado: 10%");
		 }
		 else if(total > 500) {
			 val_descontado =  total - total * 0.15;
			 System.out.println("Desconto aplicado: 15%");
		 }
		 System.out.println("Valor total com desconto: R$" + val_descontado);
		
	}
}