
public class Produto {
	
	private String nome;
	private Double preco; 
	private int quant;
	
	public Produto(String nome, Double preco, int quant) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quant = quant;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	

	public Double soma(){
		return getPreco() * getQuant();
	}
	
}
