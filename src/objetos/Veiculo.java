package objetos;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private String tamanho;
	private String horaEntrada;
	private String horaSaida;
	
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
	public String getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(String horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public String getHoraSaida() {
		return horaSaida;
	}
	public void setHoraSaida(String horaSaida) {
		this.horaSaida = horaSaida;
	}
	
	public Veiculo(String placa, String modelo, String tamanho, String horaEntrada, String horaSaida) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}
	public Veiculo() {
		super();
	}
	
	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", tamanho=" + tamanho + ", horaEntrada="
				+ horaEntrada + ", horaSaida=" + horaSaida + "]";
	}
	
	

}
