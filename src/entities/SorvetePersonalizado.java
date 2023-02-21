package entities;

public class SorvetePersonalizado extends Produto {

	private String sabor1;
	private String sabor2;
	private String sabor3;

	public SorvetePersonalizado(Integer id, String nome, String tipo, String sabor, Double precoUnitario, String sabor1,
			String sabor2, String sabor3) {
		super(id, nome, tipo, sabor, precoUnitario);
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
		this.sabor3 = sabor3;
	}

	public String getSabor1() {
		return sabor1;
	}

	public void setSabor1(String sabor1) {
		this.sabor1 = sabor1;
	}

	public String getSabor2() {
		return sabor2;
	}

	public void setSabor2(String sabor2) {
		this.sabor2 = sabor2;
	}

	public String getSabor3() {
		return sabor3;
	}

	public void setSabor3(String sabor3) {
		this.sabor3 = sabor3;
	}

}
