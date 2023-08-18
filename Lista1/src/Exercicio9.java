import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int val;
		
		System.out.println("Digite um número qualquer");
		val =  sc.nextInt();
		
		if(val % 2 == 1) {
			System.out.println(val + " é um número primo");
		} else {System.out.println(val + " não é um número primo");}
		
	}

}
