package entities;

public class Entrega {
	
	private Double taxa;
	private String tipoEntrega;
	
	public Entrega(Double taxa, String tipoEntrega) {
		this.taxa = taxa;
		this.tipoEntrega = tipoEntrega;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public String getTipoEntrega() {
		return tipoEntrega;
	}

	public void setTipoEntrega(String tipoEntrega) {
		this.tipoEntrega = tipoEntrega;
	}


	public void mostrarDadosRetirada(String nome, String telefone) {
		System.out.println("Tempo estimado para retirada é de 30 minutos. ");
		System.out.println(nome + "\n" + telefone);

	}

	public void mostrarDadosEntrega(String nome, String endereco, String telefone) {
		System.out.println(nome + "\n" + endereco + "\n" + telefone);
		System.out.println("Taxa de entrega R$10.00 ");
		System.out.println("O seu pedido sera entregue em até 90 minutos.");

	}
	public void pedidoFinalizado(String nome, String endereco, String telefone, String taxaEntrega) {
		System.out.println(nome + "\n" + endereco + "\n" + telefone + "\n" + taxaEntrega);
	}
}