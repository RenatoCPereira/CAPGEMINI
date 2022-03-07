package br.com.questao3;

import java.util.ArrayList;
import java.util.Scanner;

public class Encriptado {

	public static void main(String[] args) {

		ArrayList<String> nome = new ArrayList<>();
		String nome1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Olá, tudo bem?!");
		System.out.println("Digite o texto: ");
		nome1 = sc.nextLine().replace(" ", "");

		nome.add(nome1);

		System.out.println("A palavra digitada: " + nome);

	}

}
