package model;

public class Produto {

	private Long id;
	private String nome;
	private String tipo;
	private String sabor;
	private Double precoUnitario;

	public Produto(Long id, String nome, String tipo, String sabor, Double precoUnitario) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.sabor = sabor;
		this.precoUnitario = precoUnitario;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
		
	
	
	@Override
	public String toString() {
		return String.format( " 🍧 %.2f ------------ ",precoUnitario) + " " + id + " " + nome + " " + sabor + " " ;
	}
	

}
