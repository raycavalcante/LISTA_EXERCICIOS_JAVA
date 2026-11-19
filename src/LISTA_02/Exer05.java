package LISTA_02;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("preco produto: ");
			double pc = scan.nextDouble();
			
			System.out.print("quantidade: ");
			int qtd = scan.nextInt();
			
			System.out.print("Dinheiro: ");
			double din = scan.nextDouble();
			
			double troco = din - (pc*qtd);
			
			if(din>(pc*qtd)) {
				
				System.out.println("Troco = "+troco);
			}
			else {
				
				troco = (pc*qtd) - din;
				
				System.out.println("DINHEIRO INSUFICIENTE. FALTAM "+troco+" REAIS");
			}
			
			scan.close();
			
		}
		
	
}
