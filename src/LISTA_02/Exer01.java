package LISTA_02;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.print("nota 1:");
		double n1 = scan.nextDouble();
		
		System.out.print("Nota 2: ");
		double n2 = scan.nextDouble();
		
		double md = (n1+n2) / 2;
		
		System.out.printf("MEDIA FINAL: %.1F",md);
		
		String saida = "Reprovado";
		
		if(md>=6) {
			saida = "Aprovado";
		}
		
		System.out.println(saida);

		scan.close();

	}

}
