package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Cliente;
import model.Pedido;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.Produto;
import model.util.Cores;
import model.util.LeituraArquivo;

public class Menu {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		LeituraArquivo lerArquivo = new LeituraArquivo();

		List<Produto> sorvetesMassa = lerArquivo.sorveteMassa();
		List<Produto> picoles = lerArquivo.picole();
		List<Produto> adicionais = lerArquivo.adicionais();
		List<Produto> sorvetesPersonalizados = lerArquivo.sorvetePersonalizado();
		List<PessoaFisica> pessoasFisicas = lerArquivo.pessoasFisicas();
		List<PessoaJuridica> pessoasJuridicas = lerArquivo.pessoasJuridicas();

		System.out.println(Cores.TEXT_PURPLE_BOLD + ""
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             ⢀⠔⠚⠉⠉⠙⠲⣤⠀⠀⠀             \r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             ⡰⠁⠀⠀⠀⠀⠀⠀⠈⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             ⢀⣠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  \r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             ⣴⣿⠛⡇⠀⠀⠀⠀⠀⠀⠀⠀⡠⠃⢹⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀            .⣴⡿⠋⣇⠀⠘⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡟⢿⣷⡄⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀             ⢀⣾⡿⠁⠀⠘⣷⣦⣤⣀⣀⣀⣀⣀⣀⣠⣤⣾⣿⡟⠁⠀⠹⣿⡄⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀              ⣼⣿⠁⠀⠀⠀⠸⡻⠽⣿⣛⣛⣻⣿⣻⣿⣿⣿⡿⠀⠀⠀⠀  ⢹⣿⡀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⢀⣿⡇⠀⠀⠀⠀⠀⠳⢤⣤⣤⣤⣤⣴⣿⣿⣿⠿⠃⠀⠀⠀⠀  ⠈⣿⡇⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⢸⣿⡇⠀⠀⠀⠀⠀⠀⠘⡏⢫⡝⠛⢯⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀    ⣿⡇⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀\r\n" + Cores.TEXT_RESET + Cores.TEXT_WHITE_BOLD
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠸⡍⠑ ⡼⠱ ⢸⣉⡱ ⣇⠀⡇⢸⠉⠉ ⠋⡏⠃⢸⡋⠉⢠⠋⠉⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⢠⣘⣦ ⢣⡰ ⢸⠈⢆ ⠘⡼ ⢸⣉⣀⠀ ⡇  ⢸⣉⣀⠸⣄⣀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n" + Cores.TEXT_RESET + Cores.TEXT_PURPLE_BOLD
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀               ⠉⠉⠉⠉⠉⠉⠉⠻⣿⣯⣍⡉⠉⠉⠹⣿⡿⠉⠉⠉⣉⣭⣿⡿⠋⠉⠉⠉⠉⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀                ⠈⠙⠻⠿⣿⣶⣶⣿⣷⣶⣾⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");

		System.out.println();
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT
				+ "                 Funcionamento: Terça a Domingo das 9h às 23h | Segunda-feira: Fechado");
		System.out.println("                    Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito");
		System.out.println("                                       Pedido Mínimo: R$ 25,00");
		System.out.println("                       Taxa de Entrega: R$ 10,00 | Tempo Estimado: 30min - 90min\n\n");

		String documento = " ";
		int tipoPessoa = 0;
		Cliente pessoaFisica = new PessoaFisica();
		Cliente pessoaJuridica = new PessoaJuridica();
		do {
			System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT
					+ " _____________________________________________________________________________________________________\n"
					+ "                                               ACESSO                                                   "
					+ "\n _____________________________________________________________________________________________________\n");
			System.out.print(Cores.TEXT_BLUE_BOLD + " Digite (1) Pessoa Física | (2) Pessoa Jurídica: ");
			System.out.print(" ");
			sc.skip("\\R?");
			tipoPessoa = sc.nextInt();

			switch (tipoPessoa) {
				case 1 -> {
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite seu CPF: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaFisica.validarDadoPessoaFisica(pessoasFisicas, documento);
				}
				case 2 -> {
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite seu CNPJ: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaJuridica.validarDadoPessoaJuridica(pessoasJuridicas, documento);
				}
				default -> System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + " Opção Incorreta!\n");
			}
		} while (tipoPessoa != 1 && tipoPessoa != 2);

		List<Pedido> pedidoList = new ArrayList<>();
		long id = 0;
		int quantidade = 0;
		char resp = 'I';

		String mensagemMenu = " Carregando Menu...";
		keyPress(mensagemMenu);
		do {
			System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT +
					" _____________________________________________________________________________________________________\n"
					+ "                                               MENU                                                   "
					+ "\n _____________________________________________________________________________________________________\n");

			System.out.println(Cores.TEXT_PURPLE_BOLD +
					"        .-\"`'\"-.\r\n"
					+ "       /        \\\r\n"
					+ "       |        |\r\n"
					+ "       /'---'--`\\\r\n"
					+ "      |          |       " + Cores.TEXT_GREEN_BOLD_BRIGHT + " [1] SORVETE DE MASSA \r\n" + Cores.TEXT_PURPLE_BOLD
					+ "      \\.--.---.-./      " + Cores.TEXT_BLUE_BOLD_BRIGHT + "  [2] COPO ATÉ 3 SABORES\r\n" + Cores.TEXT_PURPLE_BOLD
					+ "      (_.--._.-._)       " + Cores.TEXT_YELLOW_BOLD_BRIGHT + " [3] PICOLÉS \r\n" + Cores.TEXT_PURPLE_BOLD
					+ "        \\=-=-=-/        " + Cores.TEXT_RED_BOLD_BRIGHT + "  [4] ADICIONAIS\r\n" + Cores.TEXT_PURPLE_BOLD
					+ "         \\=-=-/\r\n"
					+ "          \\=-/\r\n"
					+ "           \\/\n");

			System.out.print(Cores.TEXT_PURPLE_BOLD_BRIGHT + "\n" + " Digite o número de uma categoria: ");
			sc.skip("\\R?");

			int categoria = sc.nextInt();

			while (categoria != 1 && categoria != 2 && categoria != 3 && categoria != 4) {
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + " Opção inválida!");

				System.out.println(Cores.TEXT_PURPLE_BOLD_BRIGHT +
						"        .-\"`'\"-.\r\n"
						+ "       /        \\\r\n"
						+ "       |        |\r\n"
						+ "       /'---'--`\\\r\n"
						+ "      |          |       " + Cores.TEXT_GREEN_BOLD_BRIGHT + " [1] SORVETE DE MASSA \r\n" + Cores.TEXT_PURPLE_BOLD
						+ "      \\.--.---.-./      " + Cores.TEXT_BLUE_BOLD_BRIGHT + "  [2] COPO ATÉ 3 SABORES\r\n" + Cores.TEXT_PURPLE_BOLD
						+ "      (_.--._.-._)       " + Cores.TEXT_YELLOW_BOLD_BRIGHT + " [3] PICOLÉS \r\n" + Cores.TEXT_PURPLE_BOLD
						+ "        \\=-=-=-/        " + Cores.TEXT_RED_BOLD_BRIGHT + "  [4] ADICIONAIS\r\n" + Cores.TEXT_PURPLE_BOLD
						+ "         \\=-=-/\r\n"
						+ "          \\=-/\r\n"
						+ "           \\/\n");

				System.out.print("\n" + " Digite o número de uma categoria: ");
				sc.skip("\\R?");

				categoria = sc.nextInt();
			}
			String mensagemCategoria = " Carregando Categoria...";
			keyPress(mensagemCategoria);
			switch (categoria) {

				case 1:
					System.out.println();
					sorvetesMassa.forEach(System.out::println);
					System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite a quantidade: ");
					sc.skip("\\R?");
					quantidade = sc.nextInt();

					for (Produto sorveteMassa : sorvetesMassa) {
						if (sorveteMassa.getId().equals(id)) {
							pedidoList.add(new Pedido(sorveteMassa.getId(), sorveteMassa.getNome(), quantidade,
									sorveteMassa.getPrecoUnitario()));
						}
					}
					break;
				case 2:
					System.out.println();
					sorvetesPersonalizados.forEach(System.out::println);
					System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + ""
							+ Cores.TEXT_GREEN + "            ,\n"
							+ Cores.TEXT_RED_BOLD_BRIGHT + "           ()\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "        .-\"`'\"-.\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "       /        \\\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "       \\        /\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "       /'---'--`\\\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "      |          |\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "      \\_.--.__.-./\r\n"
							+ Cores.TEXT_CYAN_BOLD_BRIGHT + "      (_.__..__._)\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "        [=-=-=-]\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "         |=-=-|\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "         |-=-=|\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "         '-==-'");

					System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite a quantidade: ");
					sc.skip("\\R?");
					quantidade = sc.nextInt();

					for (Produto sorvetePersonalizados : sorvetesPersonalizados) {
						if (sorvetePersonalizados.getId().equals(id)) {
							pedidoList.add(new Pedido(sorvetePersonalizados.getId(), sorvetePersonalizados.getNome(),
									quantidade, sorvetePersonalizados.getPrecoUnitario()));
						}
					}
					break;
				case 3:
					System.out.println();
					picoles.forEach(System.out::println);
					System.out.println(""
							+ Cores.TEXT_BLUE_BOLD + "                     .-.\r\n"
							+ Cores.TEXT_BLUE_BOLD + "                   ,'/ //\\\r\n"
							+ Cores.TEXT_BLUE_BOLD + "                 /// // /)\r\n"
							+ Cores.TEXT_BLUE_BOLD + "                /// // //|\r\n"
							+ Cores.TEXT_BLUE_BOLD + "               /// // ///\r\n"
							+ Cores.TEXT_BLUE_BOLD + "              /// // ///\r\n"
							+ Cores.TEXT_BLUE_BOLD + "             (`: // ///\r\n"
							+ Cores.TEXT_BLUE_BOLD + "              `;`: ///\r\n"
							+ Cores.TEXT_BLUE_BOLD + "                 :`:/\r"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "               / /\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "              / /\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "             / /\r\n"
							+ Cores.TEXT_YELLOW_BOLD_BRIGHT + "            (_/  \r\n"
							+ "");
					System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite a quantidade: ");
					sc.skip("\\R?");
					quantidade = sc.nextInt();

					for (Produto picole : picoles) {
						if (picole.getId().equals(id)) {
							pedidoList.add(
									new Pedido(picole.getId(), picole.getNome(), quantidade, picole.getPrecoUnitario()));
						}
					}
					break;
				case 4:
					System.out.println();
					adicionais.forEach(System.out::println);
					System.out.println("\n"
							+ Cores.TEXT_WHITE_BOLD_BRIGHT + "                    //\r\n"
							+ Cores.TEXT_WHITE_BOLD_BRIGHT + "                   //\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "           ______ " + Cores.TEXT_WHITE_BOLD_BRIGHT + "//\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          /______'/|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [       ]|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [       ]|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [ Suco  ]|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [  _\\_  ]|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [  :::  ]|\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          [   :'  ]/\r\n"
							+ Cores.TEXT_BLACK_BOLD_BRIGHT + "          '-------'");

					System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(Cores.TEXT_BLUE_BOLD + " Digite a quantidade: ");
					sc.skip("\\R?");
					quantidade = sc.nextInt();

					for (Produto adicional : adicionais) {
						if (adicional.getId().equals(id)) {
							pedidoList.add(new Pedido(adicional.getId(), adicional.getNome(), quantidade,
									adicional.getPrecoUnitario()));
						}
					}
					break;
			}
			System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Deseja inserir mais um produto? Digite S ou N: ");
			sc.skip("\\R?");
			resp = sc.next().toUpperCase().charAt(0);
		} while (resp == 'S');


		Pedido pedidoCliente = new Pedido();
		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT
				+ " _____________________________________________________________________________________________________\n\n"
				+ "                                             MEU PEDIDO                                                 ");

		pedidoList.forEach(System.out::println);

		double valorCliente = pedidoCliente.calcularPedido(pedidoList);
		pedidoCliente.confirmaPagamento(pedidoList);


		int tipoEntrega = 0;
		do {
			System.out.println("\n"
					+ Cores.TEXT_CYAN_BOLD_BRIGHT
					+ " _____________________________________________________________________________________________________\n"
					+ "                                               ENTREGA                                                   "
					+ "\n _____________________________________________________________________________________________________");

			System.out.print(Cores.TEXT_BLUE_BOLD + "\n" + " Digite (1) para Delivery ou (2) Retirada:");
			sc.skip("\\R?");
			System.out.print(" ");
			tipoEntrega = sc.nextInt();
		} while (tipoEntrega != 1 && tipoEntrega != 2);

		double calculoTotal = 0;
		if (tipoEntrega == 1) {
			calculoTotal = pedidoCliente.calcularPedido(pedidoList) + 10;
			System.out.printf(Cores.TEXT_BLUE_BOLD + " Total com a Entrega: R$ %.2f\n", calculoTotal);

		} else if (tipoEntrega == 2) {
			calculoTotal = valorCliente;

		}

		String mensagemEntrega = " Confirmando Entrega...";
		keyPress(mensagemEntrega);

		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT
				+ " _____________________________________________________________________________________________________\n"
				+ "                                            PAGAMENTO                                                 "
				+ " \n _____________________________________________________________________________________________________\n");

		System.out.println(Cores.TEXT_BLUE_BOLD + " Formas de Pagamento disponíveis: Dinheiro, Pix | Cartão de Débito e Cartão de Crédito");
		System.out.print(Cores.TEXT_BLUE_BOLD + " Digite a forma de pagamento escolhida:");
		sc.skip("\\R?");
		System.out.print(" ");
		String formaPagamento = sc.nextLine();
		if (formaPagamento.equalsIgnoreCase("dinheiro")) {
			System.out.print(Cores.TEXT_BLUE_BOLD + " Digite o valor em dinheiro: R$ ");
			sc.skip("\\R?");
			System.out.print(" ");
			double valorDinheiro = sc.nextDouble();

			while (valorDinheiro < calculoTotal) {
				System.out.print(Cores.TEXT_BLUE_BOLD + " Valor em Dinheiro Insuficiente!\n");
				System.out.print(Cores.TEXT_BLUE_BOLD + " Digite o valor em dinheiro:");
				System.out.print(" ");
				sc.skip("\\R?");
				valorDinheiro = sc.nextDouble();
			}
			System.out.printf(Cores.TEXT_BLUE_BOLD + "Troco: R$ %.2f\n\n", pedidoCliente.trocarDinheiro(calculoTotal, valorDinheiro, tipoEntrega));
		}

		String mensagemConfirmacao = " Imprimindo Nota...";
		keyPress(mensagemConfirmacao);

		pedidoCliente.imprimirNota(tipoEntrega, pedidoList);

		String mensagemFinalizando = " Finalizando Pedido...";
		keyPress(mensagemFinalizando);

		pessoaFisica.imprimirPessoaFisica(pessoasFisicas, documento, tipoEntrega);
		pessoaJuridica.imprimirPessoaJuridica(pessoasJuridicas, documento, tipoEntrega);
	}

	public static void keyPress(String mensagem) {

		try {

			System.out.println(Cores.TEXT_RESET + mensagem);
			System.in.read();

		} catch (IOException e) {

			System.out.println(Cores.TEXT_RED_BOLD + "Você pressionou uma tecla diferente de enter!");

		}
	
	}
	
}