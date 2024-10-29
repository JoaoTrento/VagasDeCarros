package objetos;

public class Vaga {
	
	private int numero;
	private String tamanho;
	private Boolean disponivel;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	public Vaga(int numero, String tamanho, Boolean disponivel) {
		super();
		this.numero = numero;
		this.tamanho = tamanho;
		this.disponivel = disponivel;
	}
	public Vaga() {
		super();
	}
	
	@Override
	public String toString() {
		return "Vaga [numero=" + numero + ", tamanho=" + tamanho + ", disponivel=" + disponivel + "]";
	}
	
	

}
