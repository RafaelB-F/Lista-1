package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// variaveis principais
		int time = 1, jogadores = 3;
		int idade;
		double peso, altura;

		// variaveis auxiliares e de resultado
		int soma_menores_18 = 0, menores_18 = 0;
		double media_idade = 0;
		int som_idade = 0, qtd_jogadores = 0;
		double soma_altura = 0, media_altura = 0;
		int peso_maior_80 = 0;
		double percentual = 0;

		for (int i = 1; i <= time; i++) {
			System.out.println("TIME: " + i);

			for (int j = 1; j <= jogadores; j++) {

				System.out.println("digite a idade do jogador: ");
				idade = sc.nextInt();
				System.out.println("digite o peso do jogador: ");
				peso = sc.nextDouble();
				System.out.println("digite a altura do jogador: ");
				altura = sc.nextDouble();

				// contador menores de 18
				if (idade < 18) {
					menores_18++;
				}

				// contador e somador das idades para calculo da média

				qtd_jogadores++;
				som_idade = som_idade + idade;
				
				//somador das alturas dos jogadores de cada time
				soma_altura = soma_altura + altura;
				
				//quantidade de jogadores com mais de 80kg
				if(peso > 80) {
					peso_maior_80++;
				}

			}

			media_idade = (double) som_idade / qtd_jogadores;
			System.out.println(" ");
			System.out.println("Média das idades dos jogadore do time " + i + ": " + media_idade);
			System.out.println(" ");
			
			percentual = peso_maior_80 *100 / qtd_jogadores;

			soma_menores_18 = 0;
			soma_menores_18 = soma_menores_18 + menores_18;
			
			media_altura = soma_altura / qtd_jogadores;

		}

		System.out.println("Quantidade de jogadores menores que 18 anos: " + soma_menores_18);
		System.out.println("Médias de altura dos participantes o campeonato: " + media_altura);
		System.out.println("porcentagem de jogadores acima de 80kg: " + percentual );
	}

}
