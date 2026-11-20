package LISTA_03;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int senha = 2002;
		
		String msg = "Digite a senha: ";
		
		
		
		while(true) {
			System.out.print(msg);
			int sh = scan.nextInt();
			
			if(sh==senha) {
				System.out.println("Acesso permitido!");
				break;
			}else {
				msg = "Senha Invalida! Tente novamente: ";
			}
			
		}


		scan.close();

	}
}
