package ifsc;

public abstract class Produto {
	
	private String fabricante;
	private Long codBarra;
	
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public Long getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(Long codBarra) {
		this.codBarra = codBarra;
	}

}
