package br.com.questao2;

public class Vetor {

	// METODO UTILIZADO PARA FAZER A COMPARA??O DE CADA POSI??O DO ARRAY
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

		// ARRAY DO EXERCIO UTILIZADO PARA O DESENVOLVIMENTO
		int[] array = { 1, 5, 3, 4, 2 };

		int resultado = Metodo(array, 2);

		System.out.println("Existem  " + resultado + "  pares ");

	}
}