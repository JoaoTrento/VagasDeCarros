package objetos;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private String tamanho;
	private int horaDaEntrada;
	private int minutoDaEntrada;
	private int horaDaSaida;
	private int minutoDaSaida;
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public int getHoraDaEntrada() {
		return horaDaEntrada;
	}
	public void setHoraDaEntrada(int horaDaEntrada) {
		this.horaDaEntrada = horaDaEntrada;
	}
	public int getMinutoDaEntrada() {
		return minutoDaEntrada;
	}
	public void setMinutoDaEntrada(int minutoDaEntrada) {
		this.minutoDaEntrada = minutoDaEntrada;
	}
	public int getHoraDaSaida() {
		return horaDaSaida;
	}
	public void setHoraDaSaida(int horaDaSaida) {
		this.horaDaSaida = horaDaSaida;
	}
	public int getMinutoDaSaida() {
		return minutoDaSaida;
	}
	public void setMinutoDaSaida(int minutoDaSaida) {
		this.minutoDaSaida = minutoDaSaida;
	}
	public Veiculo(String placa, String modelo, String tamanho, int horaDaEntrada, int minutoDaEntrada, int horaDaSaida,
			int minutoDaSaida) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.horaDaEntrada = horaDaEntrada;
		this.minutoDaEntrada = minutoDaEntrada;
		this.horaDaSaida = horaDaSaida;
		this.minutoDaSaida = minutoDaSaida;
	}
	public Veiculo() {
		super();
	}
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", tamanho=" + tamanho + ", horaDaEntrada="
				+ horaDaEntrada + ":" + minutoDaEntrada + ", horaDaSaida=" + horaDaSaida
				+ ":" + minutoDaSaida + "]";
	}
	
	
	
	

}
