package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Produto;
import entities.SorvetePersonalizado;
import entities.util.LeituraArquivo;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		LeituraArquivo lerArquivo = new LeituraArquivo();

		List<Produto> sorvetesMassa = lerArquivo.sorveteMassa();
		List<Produto> picoles = lerArquivo.picole();
		List<Produto> adicionais = lerArquivo.adicionais();
		List<Produto> sorvetesPersonalizados = lerArquivo.sorvetePersonalizado();
//		List<Produto> cliente = lerArquivo.cliente();

		System.out.println("Qual destas categorias gostaria de pedir hoje: \n" 
		+ "1- Pote de Sorvete de 2lts\n" + "2- Copo com bolas de sorvete\n" + "3- Picolé\n"+ "4- Adicionais\n"
				+"Digite o número da categoria:\n ");


		int categoria = sc.nextInt();

		switch (categoria) {

		case 1:
			sorvetesMassa.forEach(System.out::println);
			break;
		case 2:
			sorvetesPersonalizados.forEach(System.out::println);

			break;
		case 3:
			picoles.forEach(System.out::println);
			break;
		case 4:
			adicionais.forEach(System.out::println);
			break;
		}

	}
}
