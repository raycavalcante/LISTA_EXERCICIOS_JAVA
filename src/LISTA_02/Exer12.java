package LISTA_02;

import java.util.Scanner;

public class Exer12 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("hora inicial: ");
		int ini = scan.nextInt();
		
		System.out.print("hora Final: ");
		int fin = scan.nextInt();
		
		int hora  =0 ;
		
		if(ini<fin) {
			hora = fin - ini;
		}
		else if(fin<ini) {
			hora = 24 - ini;
			hora += fin;
		}else {
			hora = 24;
		}
		
		System.out.println("O JOGO DUROU "+hora+" HORA(S)");

		scan.close();

	}
}
