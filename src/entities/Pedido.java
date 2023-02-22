package entities;

import java.util.ArrayList;
import java.util.List;

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

	public Double calcularPedido(List<Pedido> pedidoList ){

		double soma=0;

		for (Pedido pedido:pedidoList){
			soma += pedido.valor * pedido.quantidade ;
		}
		return soma;
	}

	public void confirmaPagamento(String formaPagamento){
		System.out.println("CONFIRMAR PEDIDO: ");
		System.out.println("ID: " + id);
		System.out.println("FORMA DE PAGAMENTO: " + formaPagamento);
		for (Pedido pedido:pedidoList){
			System.out.println(pedido);
		}
		System.out.println("VALOR TOTAL A PAGAR : " + calcularPedido());

	}
	public Double TrocarDinheiro(double valorDinheiro){
		return valorDinheiro - calcularPedido();
	}

	
	
	


}

