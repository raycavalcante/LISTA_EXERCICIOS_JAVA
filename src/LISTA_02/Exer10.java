package LISTA_02;

import java.util.Scanner;

public class Exer10 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("digite dois numeros: ");
		int n1 = scan.nextInt();
		
		int n2 = scan.nextInt();
		
		if(n1%n2==0 || n2%n1==0) {
			System.out.println("Sao multiplos");
		}
		else {
			System.out.println("Nao sao multiplos");
		}

		scan.close();

	}
}
