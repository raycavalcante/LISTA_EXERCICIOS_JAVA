package LISTA_01;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		informações do retangulo 
		
		System.out.print("base: ");
		double base = scan.nextDouble();
		
		System.out.print("altura: ");
		double altura = scan.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (altura + base);
		double diagonal = Math.sqrt(((base * base)+(altura * altura)));
		
		System.out.printf("Area: %.4f\n",area);
		System.out.printf("Perimetro: %.4f\n",perimetro);
		System.out.printf("Diagonal: %.4f",diagonal);
		
		scan.close();
	}

}
