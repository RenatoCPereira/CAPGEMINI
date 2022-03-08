package br.com.questao2;

import java.util.Scanner;

public class VetorManual {

	// METODO UTILIZADO PARA FAZER A COMPARAÇÃO DE CADA POSIÇÃO DO ARRAY
	public static int Metodo(int[] array, int x) {

		int cont = 0;
		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				int valor = array[i] - array[j];

				if (valor < 0) {

					valor = valor * -1;

				}
				if (valor == x) {
					cont++;

				}

			}

		}

		return cont;

	}

	public static void main(String[] args) {

		// CASO O USUARIO QUEIRA DIGITAR OS DADO MANUALMENTE

		Scanner teclado = new Scanner(System.in);

		int i;
		int x;
		int N;

		System.out.println("Quantos números você vai querer digitar? ");
		N = teclado.nextInt();

		int[] array = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Digite um número: ");
			array[i] = teclado.nextInt();
		}
		System.out.println("Digite um valor para x: ");
		x = teclado.nextInt();

		int resultado = Metodo(array, x);

		System.out.println("Existem  " + resultado + "  pares ");

	}

}
