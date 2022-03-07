package br.com.questao1;

import java.util.Arrays;

public class Mediana {

	public static void main(String[] args) {

		// DECLARA��O DO VETOR E DAS VARI�VEIS
		int numeros[] = { 9, 2, 1, 4, 6 };
		int esq = 0;
		int dir = numeros.length - 1;
		int meio;
		int mediana;
		
		// IMPRESS�O DO VETOR ANTES DE UTILIZAR O METODO
		System.out.println(Arrays.toString(numeros));

		// METODO PARA ORDENAR OS NUMEROS DO NEMOR PARA O MAIOR
		Arrays.sort(numeros);
		
        // IMPRESS�O DO RESULTADO APOS A FORMULA
		System.out.println(Arrays.toString(numeros));
		
        // FORMULA UTILIZADA PARA ENCONTRA O MEIO
		meio = (esq + dir) / 2;
		mediana = numeros[meio];
		
        // IMPRESS�O DO RESULTADO
		System.out.println("A mediana de numeros �: " + mediana);

	}

}
