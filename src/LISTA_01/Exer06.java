package LISTA_01;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("raio: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("AREA: %.3f",area);
		
		scan.close();
	}

}
