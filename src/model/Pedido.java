package model;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import model.util.Cores;

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
		System.out.println("\n" + " Número do Pedido: " + geraId.nextDouble());
		System.out.printf(" Total Pedido: R$ %.2f", calcularPedido(pedidoList));
		
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

		LocalDateTime dataHora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = dataHora.format(formatter);
	
			
	        
			System.out.println(
					
					"\n\n" +  "PEDIDO CONFIRMADO!\n"
							
					+ " _____________________________________________________________________________________________________\n"
					
					+ " ==================================================\n" 
					+ " SORVETEC TECNOLOGIA LTDA"+"RUA JAVA, 0101\n"
					+ " CEP.: 01.010-100 - ORIENTAÇÃO A OBJETOS/POO\n" 
					+ " CONTATO.: 11 00 0000-0000\n"
					+ " ==================================================\n" 
					+ "                  Nº 56983\r\n"
					+ " __________________________________________________\r\n" 
					+ "            COMPROVANTE DE VENDA \r\n" 
					+ "        *** NÃO É DOCUMENTO FISCAL ***\r\n");
					
			System.out.println(" Data : " + dataFormatada + "\n" +
					" __________________________________________________\r\n");

			System.out.printf("                          SUBTOTAL: R$ %.2f\n", calcularPedido(pedidoList));
			System.out.printf("                          FRETE: R$ 10.00\n");
			System.out.printf("                          TOTAL: R$ %.2f\n", (calcularPedido(pedidoList) + 10.00));
			
			System.out.println(
					"\r\n"
					+ " ________________________________________________\r\n"
					+ "         *** NÃO É DOCUMENTO FISCAL ***\r\n"
					+ " ________________________________________________\r\n"
					+ " OBS.: "
					+ " Seu pedido sera entregue em até 90 minutos.\r\n"
					+ " ==================================================\n");
			
			
		} else if (tipoEntrega == 2) {
			
			LocalDateTime dataHora = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			String dataFormatada = dataHora.format(formatter);
		        
				System.out.println(
						
						" PEDIDO CONFIRMADO!\n"
								
						+ " _____________________________________________________________________________________________________\n"
						
						+ " ==================================================\n" 
						+ " SORVETEC TECNOLOGIA LTDA"+"RUA JAVA, 0101\n"
						+ " CEP.: 01.010-100 - ORIENTAÇÃO A OBJETOS/POO\n" 
						+ " CONTATO.: 11 00 0000-0000\n"
						+ " ==================================================\n" 
						+ "                  Nº 56983\r\n"
						+ " __________________________________________________\r\n" 
						+ "            COMPROVANTE DE VENDA \r\n" 
						+ "        *** NÃO É DOCUMENTO FISCAL ***\r\n");
						
				System.out.println(" Data : " + dataFormatada + "\n" +
						" __________________________________________________\r\n");

				System.out.printf("                          SUBTOTAL: R$ %.2f\n", calcularPedido(pedidoList));
				System.out.printf("                          FRETE: R$ 00.00\n");
				System.out.printf("                          TOTAL: R$ %.2f\n", (calcularPedido(pedidoList)));
				
				System.out.println(
						"\r\n"
						+ " ________________________________________________\r\n"
						+ "         *** NÃO É DOCUMENTO FISCAL ***\r\n"
						+ " ________________________________________________\r\n"
						+ " OBS.: "
						+ " Tempo estimado para retirada é de 30 minutos..\r\n"
						+ " ==================================================\n");		
		}
	}


	@Override
	public String toString() {
		
		return   " _____________________________________________________________________________________________________\n"
				+ "  CÓD.                DESCRIÇÃO                 QTDE.         V. UNITARIO\n"
				+ "   " + id + "                  " + nomeItem + "             " + quantidade + "       " + String.format("        R$ %.2f", valor);
				
	}
	
}