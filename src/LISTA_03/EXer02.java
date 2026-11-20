package LISTA_03;

import java.util.Scanner;

public class EXer02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite as idades: ");
		
		double soma=0;
		boolean valido = false;
		int cont = 1,qtd = 0;
		
		while(true) {
			
			int idade = scan.nextInt();
			
			
			
			if(idade>0) {
				qtd++;
				soma += idade;
			}
			if(cont==1 && idade<0) {
				valido = true;
				break;
			}else if(idade<0) {
				break;
				
			}
			
			cont++;
		}
		
		if(valido) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}else {
			System.out.println("MEDIA = "+(soma/qtd));
		}

		scan.close();
	}
}
