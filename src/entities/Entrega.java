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
}
