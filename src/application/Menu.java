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
		         + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠔⠚⠉⠉⠙⠲⣤⠀⠀⠀\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡰⠁⠀⠀⠀⠀⠀⠀⠈⢻⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⣷⣦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣿⠛⡇⠀⠀⠀⠀⠀⠀⠀⠀⡠⠃⢹⣿⣷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡿⠋⣇⠀⠘⠦⣀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⡟⢿⣷⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⡿⠁⠀⠘⣷⣦⣤⣀⣀⣀⣀⣀⣀⣠⣤⣾⣿⡟⠁⠀⠹⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠁⠀⠀⠀⠸⡻⠽⣿⣛⣛⣻⣿⣻⣿⣿⣿⡿⠀⠀⠀⠀⢹⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⡇⠀⠀⠀⠀⠀⠳⢤⣤⣤⣤⣤⣴⣿⣿⣿⠿⠃⠀⠀⠀⠀⠈⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⡇⠀⠀⠀⠀⠀⠀⠘⡏⢫⡝⠛⢯⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡍⠑⠀⡼⠱⡀⢸⣉⡱⠀⣇⠀⡇⢸⠉⠉⠀⠋⡏⠃⢸⡋⠉⠀⢠⠋⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣘⣦⠀⢣⡰⠁⢸⠈⢆⠀⠘⡼⠀⢸⣉⣀⠀⠀⡇⠀⢸⣉⣀⠀⠸⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠻⣿⣯⣍⡉⠉⠉⠹⣿⡿⠉⠉⠉⣉⣭⣿⡿⠋⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⠻⠿⣿⣶⣶⣿⣷⣶⣾⡿⠿⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		
		System.out.println("");
		System.out.println(Cores.TEXT_WHITE_BOLD 
				+"         Funcionamento: Terça a Domingo das 9h às 23h | Segunda-feira: Fechado");
		System.out.println("            Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito");
		System.out.println("                              Pedido Mínimo: R$ 25,00");
		System.out.println("                 Taxa de Entrega: R$ 10,00 | Tempo Estimado: 30min - 90min\n\n");

		String documento = " ";
		int tipoPessoa = 0;
		Cliente pessoaFisica = new PessoaFisica();
		Cliente pessoaJuridica = new PessoaJuridica();
		do {
			System.out.println(Cores.TEXT_WHITE_BOLD 
					+ " _____________________________________________________________________________________________________\n"
					+ "                              ACESSO                               "
					+ "\n _____________________________________________________________________________________________________\n");
			System.out.println(" Digite (1) Pessoa Física | (2) Pessoa Jurídica: ");
			System.out.print(" ");
			sc.skip("\\R?");
			tipoPessoa = sc.nextInt();

			switch (tipoPessoa) {
				case 1 -> {
					System.out.print(" Digite seu CPF: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaFisica.validarDadoPessoaFisica(pessoasFisicas, documento);
				}
				case 2 -> {
					System.out.print(" Digite seu CNPJ: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaJuridica.validarDadoPessoaJuridica(pessoasJuridicas, documento);
				}
				default -> System.out.println(" Opção Incorreta!\n");
			}
		} while (tipoPessoa != 1 && tipoPessoa != 2);

		List<Pedido> pedidoList = new ArrayList<>();
		long id = 0;
		int quantidade = 0;
		char resp = 'I';
		
		

		do {
			System.out.println(Cores.TEXT_WHITE_BOLD + 
					" _____________________________________________________________________________________________________\n"
					+ "                               MENU                               "
					+ "\n _____________________________________________________________________________________________________\n");
			
			System.out.println(
					  "        .-\"`'\"-.\r\n"
					+ "       /        \\\r\n"
					+ "       |        |\r\n"
					+ "       /'---'--`\\\r\n"
					+ "      |          |       [1] SORVETE DE MASSA \r\n"
					+ "      \\.--.---.-./       [2] COPO ATÉ 3 SABORES\r\n"
					+ "      (_.--._.-._)       [3] PICOLÉS \r\n"
					+ "        \\=-=-=-/         [4] ADICIONAIS\r\n"
					+ "         \\=-=-/\r\n"
					+ "          \\=-/\r\n"
					+ "           \\/\n" );
			
			System.out.print("\n" + " Digite o número de uma categoria: ");
			sc.skip("\\R?");
			System.out.println(" ");
			
			int categoria = sc.nextInt();

			while(categoria != 1 && categoria != 2 && categoria != 3 && categoria != 4){
				System.out.println(" Opção inválida!");
						
						System.out.println(
						"          .-\"`'\"-.\r\n"
						+ "       /        \\\r\n"
						+ "       |        |\r\n"
						+ "       /'---'--`\\\r\n"
						+ "      |          |\r\n"
						+ "      \\.--.---.-./\r\n"
						+ "      (_.--._.-._)\r\n"
						+ "        \\=-=-=-/\r\n"
						+ "         \\=-=-/\r\n"
						+ "          \\=-/\r\n"
						+ "           \\/\n" 
						+ "\n 1- Pote Sorvete de Massa - 2l\n"
						+ "  2- Copo 500ml - até 3 sabores\n" 
						+ " 3- Picolés\n" 
						+ " 4- Adicionais\n");
						
				System.out.print("\n" + " Digite o número de uma categoria: ");
				sc.skip("\\R?");
				System.out.println(" ");

				categoria = sc.nextInt();
			}

			switch (categoria) {

				case 1:
					sorvetesMassa.forEach(System.out::println);
					System.out.print("\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(" Digite a quantidade: ");
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
					sorvetesPersonalizados.forEach(System.out::println);
					System.out.println(
							"           ()\r\n"
							+ "        .-\"`'\"-.\r\n"
							+ "       /        \\\r\n"
							+ "       \\        /\r\n"
							+ "       /'---'--`\\\r\n"
							+ "      |          |\r\n"
							+ "      \\_.--.__.-./\r\n"
							+ "      (_.__..__._)\r\n"
							+ "        [=-=-=-]\r\n"
							+ "         |=-=-|\r\n"
							+ "         |-=-=|\r\n"
							+ "         '-==-'");
					
					System.out.print("\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(" Digite a quantidade: ");
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
					picoles.forEach(System.out::println);
					System.out.println(
							"              .-.\r\n"
							+ "           ,'/ //\\\r\n"
							+ "          /// // /)\r\n"
							+ "         /// // //|\r\n"
							+ "        /// // ///\r\n"
							+ "       /// // ///\r\n"
							+ "      (`: // ///\r\n"
							+ "       `;`: ///\r\n"
							+ "       / /:`:/\r\n"
							+ "      / /  `'\r\n"
							+ "     / /\r\n"
							+ "    (_/  \r\n"
							+ "");
					System.out.print("\n" +" Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(" Digite a quantidade: ");
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
					adicionais.forEach(System.out::println);
					System.out.println("\n"
							+ "                    __\r\n"
							+ "                   /.-\r\n"
							+ "           ______ //\r\n"
							+ "          /______'/|\r\n"
							+ "          [       ]|\r\n"
							+ "          [       ]|\r\n"
							+ "          [ Suco  ]|\r\n"
							+ "          [  _\\_  ]|\r\n"
							+ "          [  :::  ]|\r\n"
							+ "          [   :'  ]/\r\n"
							+ "          '-------'");
					
					System.out.print("\n" + " Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print(" Digite a quantidade: ");
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
			System.out.print("\n" + " Deseja inserir mais um produto? Digite S ou N: ");
			sc.skip("\\R?");
			System.out.print(" ");
			resp = sc.next().toUpperCase().charAt(0);

		} while (resp == 'S');


		Pedido pedidoCliente = new Pedido();
		System.out.println(Cores.TEXT_WHITE_BOLD 
				+ " _____________________________________________________________________________________________________\n\n"
				+ "                          MEU PEDIDO                                 ");

		pedidoList.forEach(System.out::println);

		double valorCliente = pedidoCliente.calcularPedido(pedidoList);
		pedidoCliente.confirmaPagamento(pedidoList);


		int tipoEntrega = 0;
		do {
			System.out.println("\n\n" 
					+ Cores.TEXT_WHITE_BOLD 
					+" _____________________________________________________________________________________________________\n"
					+ "                          ENTREGA                                 "
					+ " \n_____________________________________________________________________________________________________");
			
			System.out.print("\n" + " Digite (1) para Delivery ou (2) Retirada:\n");
			sc.skip("\\R?");
			System.out.print(" ");
			tipoEntrega = sc.nextInt();
		}while (tipoEntrega != 1 && tipoEntrega != 2);

		double calculoTotal = 0;
		if (tipoEntrega == 1){
			calculoTotal = pedidoCliente.calcularPedido(pedidoList) + 10;
			System.out.printf(" Total com a Entrega: R$ %.2f\n",calculoTotal);
			
		} else if (tipoEntrega == 2) {
			calculoTotal = valorCliente;
			
		}
		
		
			System.out.println(Cores.TEXT_WHITE_BOLD 
				+ " _____________________________________________________________________________________________________\n"
				+ "                            PAGAMENTO                               "
				+ " \n_____________________________________________________________________________________________________\n");
		
				System.out.println(" Formas de Pagamento disponíveis: Dinheiro, Pix | Cartão de Débito e Cartão de Crédito");
				System.out.print(" Digite a forma de pagamento escolhida:");
				sc.skip("\\R?");
				System.out.print(" ");
				String formaPagamento = sc.nextLine();
		if (formaPagamento.equalsIgnoreCase("dinheiro")) {
			System.out.print(" Digite o valor em dinheiro: R$ ");
			sc.skip("\\R?");
			System.out.print(" ");
			double valorDinheiro = sc.nextDouble();

			while (valorDinheiro < calculoTotal){
				System.out.print(" Valor em Dinheiro Insuficiente!\n");
				System.out.print(" Digite o valor em dinheiro:");
				System.out.print(" ");
				sc.skip("\\R?");
				valorDinheiro = sc.nextDouble();
			}
			System.out.printf("Troco: R$ %.2f\n\n", pedidoCliente.trocarDinheiro(calculoTotal, valorDinheiro,tipoEntrega));
			keyPress();
		}

			
		pedidoCliente.imprimirNota(tipoEntrega, pedidoList);

		if (tipoPessoa == 1) {
			System.out.println(Cores.TEXT_WHITE_BOLD
					+ " Dados para Entrega:\n");
			pessoaFisica.imprimirPessoaFisica(pessoasFisicas, documento);
			keyPress();
			System.out.println(Cores.TEXT_WHITE_BOLD
					+ "SORVETES DELICIOSOS A CAMINHO!\n\n"
					+ "               ___\r\n"
					+ "             /  _\\\r\n"
					+ "             | /\\_|\r\n"
					+ "          __-'' _'\r\n"
					+ "         ----'-.\r\n"
					+ "            |#\\#)_,_\r\n"
					+ "            )##\\__ _\\__.-. \r\n"
					+ "    -  .-  (###)   '---.  `.\r\n"
					+ " -   __\\____`.#\\(      )  L(|\r\n"
					+ "   .'__//\\    \\#)`-._.' / \\\\==.\r\n"
					+ "  /_/_//\\_\\_  /#/  ### / //\\\\ \\\r\n"
					+ "   |(________(##)___/-' '| (_) |\r\n"
					+ "____\\___/_________________\\___/___________________________________________________________________");
		} else if (tipoPessoa == 2) {
			System.out.println(" Dados para Entrega:\n");
			pessoaJuridica.imprimirPessoaJuridica(pessoasJuridicas, documento);
			keyPress();
			System.out.println("PEDIDO A CAMINHO!");
		}

		System.out.println(" Copyright ©️ 2023 - SORVETEC");
		}
		

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para confirmar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	
	
	}
	
}
