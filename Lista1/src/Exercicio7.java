import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int val1 = 0, val2 = 0;
		int fat = 1;

		System.out.println("Digite o o intervalo que deseja calcular os fatoriais:");
		val1 = sc.nextInt();
		val2 = sc.nextInt();

		int x = 0;

		if (val2 < val1) {
			x = val2;
			val2 = val1;
			val1 = x;
		}

		for (int i = val1; i <= val2; i++) {

			for (int j = 1; j <= i; j++) {

				fat *= j;

			}
			System.out.println("fatorial de " + i + ": " + fat);
			fat = 1;
		}

	}
}
