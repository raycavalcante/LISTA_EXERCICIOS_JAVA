package LISTA_01;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("distancia: ");
		int distancia = scan.nextInt();
		
		System.out.print("combustivel gasto: ");
		double gasto = scan.nextDouble();
		
		double consumo = distancia / gasto;
		
		System.out.printf("Consumo medio %.3f ",consumo);
		
		scan.close();
	}

}
