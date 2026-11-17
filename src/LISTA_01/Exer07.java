package LISTA_01;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Valor hora: ");
		double hora = scan.nextDouble();
		
		System.out.print("Horas trabalhadas: ");
		int trabalho = scan.nextInt();
		
		double salario = hora * trabalho;
		
		System.out.printf("O pagamento para "+nome+" deve ser %.2f",salario);
		
		scan.close();
	}

}
