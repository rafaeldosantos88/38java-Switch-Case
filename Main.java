package estruturaCase;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//Quando se tem várias opções de fluxo a serem tratadas com base no valor de
//de uma variável,ao invés de várias estruturas if-else encadeadas,agluns
//preferem utilizar a estrutura switch-casa.
//→fazer um programa para ler valor de 1 a 7 representando um dia da semana.

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;

		switch (x) { // vou avaliar a expressão x
		case 1: // Caso valor de x for 1 vou atribuir para variavel dia o valor domingo.
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sabado";
			break;
		default:
			dia = "Dia invalido";
			break;

		}
		System.out.println("Dia da semana : " + dia);

		sc.close();

	}
}
