package soul;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		char calculo;
		int n1, n2, res = 0;
		
		System.out.println("Qual o operador? + - / *");
		calculo = scan.nextLine().charAt(0);
		
		System.out.println("Valor: ");
		n1 = scan.nextInt();
		System.out.println("Valor: ");
		n2 = scan.nextInt();
		
		switch (calculo) {
		
		case '+':
			res = n1 + n2;
		break;
		
		case '-':
			res = n1 - n2;
		break;
		
		case '*':
			res = n1 * n2;
		break;
		
		case '/':
			res = n1 / n2;
		break;
		}
		
		System.out.println("Resultado: " + res);
		
	}

}
