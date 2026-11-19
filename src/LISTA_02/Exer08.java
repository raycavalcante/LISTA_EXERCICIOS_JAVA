package LISTA_02;

import java.util.Scanner;

public class Exer08 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("temperatura em qual escala (c/f) ");
		String op = scan.next().toLowerCase();
		
		
		double temp = 0, valor=0;
		
		switch(op) {
		case "c":
			System.out.print("temperatura em Celcius: ");
			valor = scan.nextDouble();
			
			temp = valor * 1.8 + 32;
			
			System.out.printf("Temperatura em Fahrenheit: %.2f",temp);
			break;
		case "f":
			System.out.print("temperatura em Fahrenheit: : ");
			valor = scan.nextDouble();
			
			temp = (valor - 32) / 1.8;
			
			System.out.printf("Temperatura em Celcius: %.2f",temp);break;
			default: System.out.println("Opcao invalida!");
		}
		scan.close();

	}
}
