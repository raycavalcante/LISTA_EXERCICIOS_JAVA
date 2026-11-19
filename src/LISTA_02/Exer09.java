package LISTA_02;

import java.util.Scanner;

public class Exer09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("codigo: ");
		int cd = scan.nextInt();
		
		System.out.print("quantidade: ");
		int qtd = scan.nextInt();
		
		double pagar = 0;
		
		switch(cd) {
		case 1:
			pagar = qtd * 5;break;
		case 2:
			pagar = qtd * 3.5;break;
		case 3:
			pagar = qtd * 4.8;break;
		case 4:
			pagar = qtd * 8.9;break;
		case 5:
			pagar = qtd * 7.32;break;
		default:System.out.println("opcao invalida!");
		}
		
		System.out.println("valor a pagar: "+pagar);
		scan.close();

	}
}
