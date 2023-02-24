package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.*;
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

		System.out.println("----------------LOGO-----------------------");
		System.out.println("----------------BEM-VINDO!-----------------");
		System.out.println("Funcionamento: Terça a Domingo das 9h às 23h | Segunda: Fechado");
		System.out.println("Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito");
		System.out.println("Pedido Mínimo: R$25,00");
		System.out.println("Taxa de Entrega: R$10,00 | Tempo Estimado: 30min - 90min");

		String documento = " ";
		int tipoPessoa = 0;
		Cliente pessoaFisica = new PessoaFisica();
		Cliente pessoaJuridica = new PessoaJuridica();
		do {
			System.out.println("Digite (1) Pessoa Física | (2) Pessoa Jurídica: ");
			sc.skip("\\R?");
			tipoPessoa = sc.nextInt();

			switch (tipoPessoa) {
				case 1 -> {
					System.out.println("Digite seu CPF: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaFisica.validarDadoPessoaFisica(pessoasFisicas, documento);
				}
				case 2 -> {
					System.out.println("Digite seu CNPJ: ");
					sc.skip("\\R?");
					documento = sc.nextLine();
					pessoaJuridica.validarDadoPessoaJuridica(pessoasJuridicas, documento);
				}
				default -> System.out.println("Opção Incorreta!");
			}
		} while (tipoPessoa != 1 && tipoPessoa != 2);

		List<Pedido> pedidoList = new ArrayList<>();
		long id = 0;
		int quantidade = 0;
		char resp = 'I';

		do {

			System.out.println("Qual destas categorias gostaria de pedir hoje: \n" + "1- Pote de Sorvete de 2lts\n"
					+ "2- Copo com bolas de sorvete\n" + "3- Picolé\n" + "4- Adicionais\n"
					+ "Digite o número da categoria: ");

			int categoria = sc.nextInt();

			while(categoria != 1 && categoria != 2 && categoria != 3 && categoria != 4){
				System.out.println("Opção inválida!");
				System.out.println("Qual destas categorias gostaria de pedir hoje: \n" + "1- Pote de Sorvete de 2lts\n"
						+ "2- Copo com bolas de sorvete\n" + "3- Picolé\n" + "4- Adicionais\n"
						+ "Digite o número da categoria: ");

				categoria = sc.nextInt();
			}

			switch (categoria) {

				case 1:
					sorvetesMassa.forEach(System.out::println);
					System.out.print("Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print("Digite a quantidade: ");
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
					System.out.print("Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print("Digite a quantidade: ");
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
					System.out.print("Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print("Digite a quantidade: ");
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
					System.out.print("Digite o numero do item: ");
					sc.skip("\\R?");
					id = sc.nextInt();
					System.out.print("Digite a quantidade: ");
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
			System.out.println("Deseja inserir mais um produto? ");
			sc.skip("\\R?");
			resp = sc.next().toUpperCase().charAt(0);

		} while (resp == 'S');


		Pedido pedidoCliente = new Pedido();

		pedidoList.forEach(System.out::println);

		double valorCliente = pedidoCliente.calcularPedido(pedidoList);
		pedidoCliente.confirmaPagamento(pedidoList);

		int tipoEntrega = 0;
		do {
			System.out.println("Digite (1) Delivery | (2) Retirada: ");
			sc.skip("\\R?");
			tipoEntrega = sc.nextInt();
		}while (tipoEntrega != 1 && tipoEntrega != 2);

		double calculoTotal = 0;
		if (tipoEntrega == 1){
			calculoTotal = pedidoCliente.calcularPedido(pedidoList) + 10;
			System.out.printf("Valor Total com Entrega: R$ %.2f\n",calculoTotal);
		} else if (tipoEntrega == 2) {
			calculoTotal = valorCliente;
		}

		System.out.println("Qual forma de pagamento: ");
		sc.skip("\\R?");
		String formaPagamento = sc.nextLine();
		if (formaPagamento.equalsIgnoreCase("dinheiro")) {
			System.out.println("Digite o valor em dinheiro: ");
			sc.skip("\\R?");
			double valorDinheiro = sc.nextDouble();

			while (valorDinheiro < calculoTotal){
				System.out.println("Valor em Dinheiro Insuficiente!");
				System.out.println("Digite o valor em dinheiro: ");
				sc.skip("\\R?");
				valorDinheiro = sc.nextDouble();
			}
			System.out.printf("Troco: R$ %.2f\n", pedidoCliente.trocarDinheiro(calculoTotal, valorDinheiro,tipoEntrega));
		}

		pedidoCliente.imprimirNota(tipoEntrega, pedidoList);

		if (tipoPessoa == 1) {
			pessoaFisica.imprimirPessoaFisica(pessoasFisicas, documento);
		} else if (tipoPessoa == 2) {
			pessoaJuridica.imprimirPessoaJuridica(pessoasJuridicas, documento);
		}

		System.out.println("🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧OBRIGADO PELA PREFERENCIA🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧🍧");
	}
}