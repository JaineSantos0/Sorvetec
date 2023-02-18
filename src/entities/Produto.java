package entities;

public class Produto {

    private String nome;
    private String tipo;
    private String sabor;
    private String cobertura;
    private String adicional;
    private Double precoUnitario;

    public Produto() {

    }

    public Produto(String nome, String tipo, String sabor, String cobertura, String adicional, Double precoUnitario) {
        this.nome = nome;
        this.tipo = tipo;
        this.sabor = sabor;
        this.cobertura = cobertura;
        this.adicional = adicional;
        this.precoUnitario = precoUnitario;
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

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getAdicional() {
        return adicional;
    }

    public void setAdicional(String adicional) {
        this.adicional = adicional;
    }

    public Double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(Double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return nome + ", " + tipo +
                ", " + sabor + ", " +
                cobertura + ", " + adicional + ", " + String.format("Preço Unitário: %.2f",precoUnitario);
    }
}