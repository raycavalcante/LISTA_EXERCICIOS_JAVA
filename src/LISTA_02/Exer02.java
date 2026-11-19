package LISTA_02;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("a: ");
		double a = scan.nextDouble();
		
		System.out.print("b: ");
		double b = scan.nextDouble();
		
		System.out.print("c: ");
		double c = scan.nextDouble();
		
		double delta = (b*b) - (4*a*c);
		
		if(delta < 0 || (2*a)==0) {
			System.out.println("É impossivel calcular X1 e X2");
		}else {
			double x1 = (-b + Math.sqrt(delta)) / (2*a);
			double x2 = (-b - Math.sqrt(delta)) / (2*a);
			
			System.out.printf("X1 = %.4f\n",x1);
			System.out.printf("X2 = %.4f",x2);
		}

		scan.close();

	}

}
