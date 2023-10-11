package ifsc;

public class Produto {
	
	private String nome;
	private Long codBarra;
	private Double preço;
	private String fornecedor;
	
	public Double getPreço() {
		return preço;
	}
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(Long codBarra) {
		this.codBarra = codBarra;
	}

}
