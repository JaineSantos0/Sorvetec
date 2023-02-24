package model;

import java.util.List;
import java.util.Random;

public class Pedido {

	private Long  id;
	private String nomeItem;
	private Integer quantidade;
	private Double valor;


	public Pedido() {
	}

	public Pedido(Long id, String nomeItem, Integer quantidade, Double valor) {
		this.id = id;
		this.nomeItem = nomeItem;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double calcularPedido(List<Pedido> pedidoList){

		double soma=0;

		for (Pedido pedido:pedidoList){
			soma += pedido.getValor() * pedido.getQuantidade() ;
		}
		return soma;
	}

	public void confirmaPagamento(List<Pedido> pedidoList){

		Random geraId = new Random();
		
		System.out.println("Confirmar pedido");
		System.out.println("Número do Pedido: " + geraId.nextInt());
		
		System.out.println("Total a pagar: " + calcularPedido(pedidoList));
		

	}
	public Double trocarDinheiro(double valorCliente, double valorDinheiro, int tipoEntrega){
		double calculoTroco = 0;
		if (tipoEntrega == 1){
			 calculoTroco = valorDinheiro - valorCliente;
		} else if (tipoEntrega == 2) {
			calculoTroco = valorDinheiro - valorCliente;
		}
		return calculoTroco;
	}

	public void imprimirNota(int tipoEntrega,List<Pedido> pedidoList ){
		if (tipoEntrega == 1){
			System.out.println("Taxa de entrega R$10.00 ");
			System.out.printf("Total Nota: R$ %.2f\n",(calcularPedido(pedidoList) + 10.00));
			System.out.println("O seu pedido sera entregue em até 90 minutos.");
		} else if (tipoEntrega == 2) {
			System.out.printf("Total Nota: R$ %.2f\n",(calcularPedido(pedidoList)));
			System.out.println("Tempo estimado para retirada é de 30 minutos. ");
		}
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", nomeItem=" + nomeItem + ", quantidade=" + quantidade + ", valor=" + valor + "]";
	}
	
}