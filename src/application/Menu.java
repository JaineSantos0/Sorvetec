package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.Produto;
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
		List<Cliente> cliente = lerArquivo.cliente();

		System.out.println("----------------LOGO-----------------------");
		System.out.println("----------------BEM-VINDO!-----------------");
		System.out.println("Funcionamento: Terça a Domingo das 9h às 23h | Segunda: Fechado");
		System.out.println("Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito");
		System.out.println("Pedido Mínimo: R$25,00");
		System.out.println("Taxa de Entrega: R$10,00 | Tempo Estimado: 30min - 90min");

		System.out.println("Digite seu telefone para realizar Login: ");
		String telefone = sc.nextLine();

		Cliente validarCliente = new Cliente();

		validarCliente.imprimirDadosCliente(cliente, telefone);

		List<Pedido> pedidoList = new ArrayList<>();
		long id = 0;
		int quantidade = 0;
		char resp = 'I';

		do {

			System.out.println("Qual destas categorias gostaria de pedir hoje: \n" + "1- Pote de Sorvete de 2lts\n"
					+ "2- Copo com bolas de sorvete\n" + "3- Picolé\n" + "4- Adicionais\n"
					+ "Digite o número da categoria:\n ");

			int categoria = sc.nextInt();

			switch (categoria) {

			case 1:
				sorvetesMassa.forEach(System.out::println);
				System.out.print("Digite o numero do item: ");
				id = sc.nextInt();
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();

				for (Produto sorveteMassa : sorvetesMassa) {
					if (sorveteMassa.getId().equals(id)) {
						pedidoList.add(new Pedido(sorveteMassa.getId(), sorveteMassa.getNome(), quantidade,
								sorveteMassa.getPrecoUnitario()));
					}
				}
				System.out.println("Deseja inserir mais um produto? ");
				resp = sc.next().toUpperCase().charAt(0);
				break;

			case 2:
				sorvetesPersonalizados.forEach(System.out::println);
				System.out.print("Digite o numero do item: ");
				id = sc.nextInt();
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();

				for (Produto sorvetePersonalizados : sorvetesPersonalizados) {
					if (sorvetePersonalizados.getId().equals(id)) {
						pedidoList.add(new Pedido(sorvetePersonalizados.getId(), sorvetePersonalizados.getNome(),
								quantidade, sorvetePersonalizados.getPrecoUnitario()));
					}
				}
				System.out.println("Deseja inserir mais um produto? ");
				resp = sc.next().toUpperCase().charAt(0);
				break;
			case 3:
				picoles.forEach(System.out::println);
				System.out.print("Digite o numero do item: ");
				id = sc.nextInt();
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();

				for (Produto picole : picoles) {
					if (picole.getId().equals(id)) {
						pedidoList.add(
								new Pedido(picole.getId(), picole.getNome(), quantidade, picole.getPrecoUnitario()));
					}
				}
				System.out.println("Deseja inserir mais um produto? ");
				resp = sc.next().toUpperCase().charAt(0);
				break;

			case 4:
				adicionais.forEach(System.out::println);
				System.out.print("Digite o numero do item: ");
				id = sc.nextInt();
				System.out.print("Digite a quantidade: ");
				quantidade = sc.nextInt();

				for (Produto adicional : adicionais) {
					if (adicional.getId().equals(id)) {
						pedidoList.add(new Pedido(adicional.getId(), adicional.getNome(), quantidade,
								adicional.getPrecoUnitario()));
					}
				}
				System.out.println("Deseja inserir mais um produto? ");
				resp = sc.next().toUpperCase().charAt(0);
				break;
			}

		} while (resp == 'S');
		
		

		Pedido pedidoCliente = new Pedido();

		pedidoList.forEach(System.out::println);

		double  valorCliente= pedidoCliente.calcularPedido(pedidoList);
		pedidoCliente.confirmaPagamento(pedidoList);
		System.out.println("Qual forma de pagamento: ");
		sc.skip("\\R?");
		String formaPagamento = sc.nextLine();
		if (formaPagamento.equalsIgnoreCase("dinheiro")) {
			System.out.println("Digite o valor em dinheiro: ");
			double valorDinheiro = sc.nextDouble();
			System.out.println(pedidoCliente.trocarDinheiro(valorCliente, valorDinheiro));
		}
		

	}
}
