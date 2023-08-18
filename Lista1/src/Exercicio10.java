import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int QTD = 10;
		int val, count = 0;

		System.out.println("Digite " + QTD + " números quaisquer");

		for (int i = 0; i < QTD; i++) {
			val = sc.nextInt();

			if (val % 2 == 1) {
				count++;
			}

		}

		System.out.println("Há um total de " + count + " números primos dentre os digitados");

	}

}
