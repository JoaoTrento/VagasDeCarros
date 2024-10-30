package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
	
	ArrayList<Vaga> listaDeVagas = new ArrayList<>();
	ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();
	
	Scanner scan = new Scanner(System.in);
	
	public void horas() {
		System.out.println("Insira a hora da chegada (hh mm):");
		int horaDaEntrada = scan.nextInt();
		int minutosDaEntrada = scan.nextInt();
		
		System.out.println("" + horaDaEntrada + ":" + minutosDaEntrada);
	}

}
