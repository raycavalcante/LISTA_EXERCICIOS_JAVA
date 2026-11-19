package LISTA_02;

import java.util.Scanner;

public class Exer11 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("salario: ");
		Double sl = scan.nextDouble();
		
		double novoS =0, au=0,por=0;
		
		switch(sl) {
		case Double d when d <= 1000 -> {
			por = 20.0/100;
			au = (sl*por);
			novoS = sl + au;
			
		}
		case Double d when d > 1000 && d <= 3000 -> {
			por = 15.0/100;
			au = (sl*por);
			novoS = sl + au;
			
		}
		case Double d when d > 3000 && d <= 8000 -> {
			por = 10.0/100;
			au = (sl*por);
			novoS = sl + au;
			
		}
		case Double d when d > 8000 -> {
			por = 5.0/100;
			au = (sl*por);
			novoS = sl + au;
			
		}
		default -> System.out.println("Opcao invalida");
		}
		
		System.out.println("Novo Salario = "+novoS);
		System.out.println("Aumento: "+au);
		System.out.println("Porcentual: "+((int) (por*100))+"%");

		scan.close();

	}
}
