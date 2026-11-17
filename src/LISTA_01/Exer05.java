package LISTA_01;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Preço: ");
		double preco = scan.nextDouble();
		
		System.out.print("quantidade: ");
		int qtd = scan.nextInt();
		
		System.out.print("Dinheiro: ");
		double din = scan.nextDouble();
		
		double troco = din - (preco * qtd);
		
		System.out.printf("troco: %.2f",troco);
		
		scan.close();
	}

}
