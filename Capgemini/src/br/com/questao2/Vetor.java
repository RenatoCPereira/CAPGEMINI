package br.com.questao2;

import java.util.Arrays;

public class Vetor {

	public static void main(String[] args) {

		int[] numeros = { 1, 5, 3, 4, 2};
		int quantidades = 2;
		int resultado = 0;

		System.out.println(Arrays.toString(numeros));

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[0] - numeros[i] == quantidades) {
				resultado++;

			}
			if (numeros[1] - numeros[i] == quantidades) {
				resultado++;

			}
			if (numeros[2] - numeros[i] == quantidades) {
				resultado++;

			}
			if (numeros[3] - numeros[i] == quantidades) {
				resultado++;

			}
			if (numeros[4] - numeros[i] == quantidades) {
				resultado++;

			}

		}

		System.out.println("Exitem  " + resultado + " pares de inteiros. ");

	}

}
