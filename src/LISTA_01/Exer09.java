package LISTA_01;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("medida A: ");
		double a = scan.nextDouble();
		
		System.out.print("medida B: ");
		double b = scan.nextDouble();
		
		System.out.print("medida C: ");
		double c = scan.nextDouble();
		
		double quadrado = a * a;
		double triangulo = (a*b) / 2 ;
		double trapezio = ((b+a)*c)/2;
		
		System.out.printf("Area do quadrado: %.4f",quadrado);
		System.out.printf("Area do triangulo: %.4f",triangulo);
		System.out.printf("Area do trapezio: %.4f",trapezio);
		
		
		
		scan.close();

	}

}
