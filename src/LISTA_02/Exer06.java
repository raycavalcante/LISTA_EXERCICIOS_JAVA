package LISTA_02;

import java.util.Scanner;

public class Exer06 {
		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

			System.out.print("Medida da glicose: ");
			Double medida = scan.nextDouble();
			
			String msg = switch(medida) {
			case Double d when d <= 100 -> "Normal";
			case Double d when d <=140 -> "Elevado";
			case Double d when d >140 -> "Diabetes";
			default -> "valor invalido";
			};
			
//			String resultado = switch (medida) {
//		    case Double d when d < 0 -> "Valor negativo";
//		    case Double d when d == 0 -> "Zero";
//		    case Double d when d > 0 && d <= 10.0 -> "Entre 0 e 10";
//		    case Double d when d > 10.0 -> "Maior que 10";
//		    case null -> "Valor nulo";
//		    default -> "Outro caso";
//		};
			
			System.out.println("classificação: "+msg);
			scan.close();
	}

}
