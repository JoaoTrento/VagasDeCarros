package objetos;

public class Veiculo {
	
	private String placa;
	private String modelo;
	private String tamanho;
	private Vaga vaga;
	private int horaDaEntrada;
	private int minutoDaEntrada;
	private int horaDaSaida;
	private int minutoDaSaida;
	private int horasTotais;
	private int minutosTotais;
	private double valorPagar;
	
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
	public Vaga getVaga() {
		return vaga;
	}
	public void setVaga(Vaga vaga) {
		this.vaga = vaga;
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
	public int getHorasTotais() {
		return horasTotais;
	}
	public void setHorasTotais(int horasTotais) {
		this.horasTotais = horasTotais;
	}
	public int getMinutosTotais() {
		return minutosTotais;
	}
	public void setMinutosTotais(int minutosTotais) {
		this.minutosTotais = minutosTotais;
	}
	public double getValorPagar() {
		return valorPagar;
	}
	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	public Veiculo(String placa, String modelo, String tamanho, Vaga vaga, int horaDaEntrada, int minutoDaEntrada,
			int horaDaSaida, int minutoDaSaida, int horasTotais, int minutosTotais, double valorPagar) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.vaga = vaga;
		this.horaDaEntrada = horaDaEntrada;
		this.minutoDaEntrada = minutoDaEntrada;
		this.horaDaSaida = horaDaSaida;
		this.minutoDaSaida = minutoDaSaida;
		this.horasTotais = horasTotais;
		this.minutosTotais = minutosTotais;
		this.valorPagar = valorPagar;
	}
	public Veiculo() {
		super();
	}
	
	@Override
	public String toString() {
		return "Veiculo [Placa=" + placa + ", Modelo=" + modelo + ", Tamanho=" + tamanho + ", Vaga=" + vaga.getNumero()
				+ ", Hora Da Entrada=" + horaDaEntrada + ":" + minutoDaEntrada + ", Hora Da Saida="
				+ horaDaSaida + ":" + minutoDaSaida + ", Tempo Estacionado=" + horasTotais + ":"
				+ minutosTotais + ", Valor Pagar=" + valorPagar + "]";
	}
	
	
	
	
	
	
	
	
	

}
