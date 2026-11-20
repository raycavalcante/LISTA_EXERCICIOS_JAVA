package LISTA_03;

import java.util.Scanner;

public class Exer05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		
		String ms = "Digite a primeira nota: ";
		
		while(true) {
			
			System.out.print(ms);
			double nota1 = scan.nextDouble();
			
			if(nota1<0 || nota1>10) {
				ms = "Valor invalido! Tente novamente: ";
			}else {
				soma += nota1;
				break;
			}
		}
		
		ms = "Digite a segunda nota: ";
		
		while(true) {
			
			System.out.print(ms);
			double nota2 = scan.nextDouble();
			
			if(nota2<0 || nota2>10) {
				ms = "Valor invalido! Tente novamente: ";
			}else {
				soma += nota2;
				break;
			}
			
		}
		
		System.out.printf("MEDIA = %.2f",(soma/2));
		scan.close();

	}
}
