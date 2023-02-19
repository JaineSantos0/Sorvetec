package entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private Integer numero;
	private String nome;
	
	private List <Produto> listProduto = new ArrayList <>();

	public Pedido(Integer numero, String nome, List<Produto> listProduto) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.listProduto = listProduto;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Produto> getListProduto() {
		return listProduto;
	}

	
	
	


}

