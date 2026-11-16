package LISTA_01;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Laegura do terreno: ");
		double largura = scan.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = scan.nextDouble();
		
		System.out.print("valor: ");
		double valor = scan.nextDouble();
		
		double area = largura * comprimento;
		
		double preco = valor * area;
		
		System.out.printf("Area: %.2f\n",area);
		System.out.printf("preco: %.2f",preco);
		
		scan.close();
	}

}
