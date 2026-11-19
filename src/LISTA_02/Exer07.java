package LISTA_02;

import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as tres distancias: ");
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		
		double maior = n1;
		
		if(n2>maior) {
			maior = n2;
		}
		if(n3>maior) {
			maior = n3;
		}

		System.out.println("MAIOR DISTANCIA = "+maior);
		
		scan.close();

	}
}
