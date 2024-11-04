package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
	
	public static ArrayList<Vaga> listaDeVagas = new ArrayList<>();
	public static ArrayList<Veiculo> listaDeVeiculos = new ArrayList<>();
	public static int numeroVaga = 0;
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void cadastrarVaga() {
		
		numeroVaga++; // numero da vaga definido automaticamente, diminui a chance do usuario fazer merda
		System.out.println("VAGA " + numeroVaga);
		
		String tamanho = "";
		Boolean menu=true;
		while(menu)
		{
			System.out.println("Qual o tamanho da vaga? \n[1] pequena \n[2] media \n[3] grande \nsua escolha: "); // usuario entra apenas com o numero assim não tem que ficar tratando uma string (se ta escrito certo, com letras minusculas ou maiusculas...)
			int esc = scan.nextInt();
			
			if(esc==1)
			{
				tamanho = "p";
				menu = false;
			}
			else if(esc==2)
			{
				tamanho = "m";
				menu = false;
			}
			else if(esc==3)
			{
				tamanho = "g";
				menu = false;
			}
			else
			{
				System.out.println("opção invalida.");
			}
		}
		menu = true;
		
		Boolean disponivel = null;
		while(menu)
		{
			System.out.println("A vaga está disponivel? \n[1] sim \n[2] não \nsua escolha: ");
			int esc = scan.nextInt();
			
			if(esc==1)
			{
				disponivel = true;
				menu = false;
			}
			else if(esc==2)
			{
				disponivel = false;
				menu = false;
			}
			else
			{
				System.out.println("opsção invalida.");
			}
		}
		
		Vaga vaga = new Vaga(numeroVaga, tamanho, disponivel);
		listaDeVagas.add(vaga);
		
	}
	
	public void exibirListaVagas() {
		
		for (Vaga vaga : listaDeVagas) 
		{
			System.out.println(vaga);
		}
	
	}
	
	public void exibirListaVagasDisponiveisP() {
		
		Boolean vagaDisponivel = false;
		
		for (Vaga vaga : listaDeVagas) 
		{
			if(vaga.getDisponivel() && vaga.getTamanho().equals("p"))
			{
				System.out.println(vaga);
				vagaDisponivel = true;
			}
		}
		
		if(!vagaDisponivel)
		{
			System.out.println("Nenhuma vaga pequena disponivel.");
		}
		
	}
	
	public void exibirListaVagasDisponiveisM() {
		
		Boolean vagaDisponivel = false;
		
		for (Vaga vaga : listaDeVagas) 
		{
			if(vaga.getDisponivel() && vaga.getTamanho().equals("m"))
			{
				System.out.println(vaga);
				vagaDisponivel = true;
			}
		}
		
		if(!vagaDisponivel)
		{
			System.out.println("Nenhuma vaga media disponivel.");
		}
		
	}

	public void exibirListaVagasDisponiveisG() {
	
	Boolean vagaDisponivel = false;
	
	for (Vaga vaga : listaDeVagas) 
	{
		if(vaga.getDisponivel() && vaga.getTamanho().equals("g"))
		{
			System.out.println(vaga);
			vagaDisponivel = true;
		}
	}
	
	if(!vagaDisponivel)
	{
		System.out.println("Nenhuma vaga grande disponivel.");
	}
	
}
	
	public void cadastrarVeiculo() {
		
		String tamanho = "";
		Boolean menu=true;
		Boolean vagaDisponivel = false;
		while(menu)
		{
			System.out.println("Qual o tamanho do carro? \n[1] pequeno \n[2] medio \n[3] grande \nsua escolha: ");
			int esc = scan.nextInt();
			
			if(esc==1)
			{
				tamanho = "p";
				for (Vaga vaga : listaDeVagas) {
					if(vaga.getDisponivel()) // teste se tem vaga disponivel
					{
						vagaDisponivel = true;
					}
				}
				menu = false;
			}
			else if(esc==2)
			{
				tamanho = "m";
				for (Vaga vaga : listaDeVagas) {
					if(vaga.getDisponivel() && (vaga.getTamanho().equals("m") || vaga.getTamanho().equals("g"))) // teste se tem vaga media ou grande disponivel
					{
						vagaDisponivel = true;
					}
				}
				menu = false;
			}
			else if(esc==3)
			{
				tamanho = "g";
				for (Vaga vaga : listaDeVagas) {
					if(vaga.getDisponivel() && vaga.getTamanho().equals("g")) // teste se tem vaga grande disponivel
					{
						vagaDisponivel = true;
					}
				}
				menu = false;
			}
			else
			{
				System.out.println("opção invalida.");
			}
		}
		menu = true;
		
		if(!vagaDisponivel)
		{
			System.out.println("Nenhuma vaga disponivel para esse tamanho de carro");
		}
		else
		{
			Vaga vagaCadastro = new Vaga();
			if(tamanho.equals("p"))
			{
				while(menu)
				{
					exibirListaVagasDisponiveisP();
					exibirListaVagasDisponiveisM();
					exibirListaVagasDisponiveisG();
					System.out.println("Selecione o numero da vaga desejada: ");
					int numeroVaga = scan.nextInt();
					for (Vaga vaga : listaDeVagas) {
						if(vaga.getNumero()==numeroVaga)
						{
							vagaCadastro=vaga;
							vaga.setDisponivel(false); // a vaga fica ocupada apos ser selecionada
							menu=false;
						}
					}
					
				}
			}
			else if(tamanho.equals("m"))
			{
				while(menu)
				{
					exibirListaVagasDisponiveisM();
					exibirListaVagasDisponiveisG();
					System.out.println("Selecione o numero da vaga desejada: ");
					int numeroVaga = scan.nextInt();
					for (Vaga vaga : listaDeVagas) {
						if(vaga.getNumero()==numeroVaga)
						{
							vagaCadastro=vaga;
							vaga.setDisponivel(false); // a vaga fica ocupada apos ser selecionada
							menu=false;
						}
					}
					
				}
			}
			else
			{
				while(menu)
				{
					exibirListaVagasDisponiveisG();
					System.out.println("Selecione o numero da vaga desejada: ");
					int numeroVaga = scan.nextInt();
					for (Vaga vaga : listaDeVagas) {
						if(vaga.getNumero()==numeroVaga)
						{
							vagaCadastro=vaga;
							vaga.setDisponivel(false); // a vaga fica ocupada apos ser selecionada
							menu=false;
						}
					}
					
				}
			}
			
			System.out.println("Insira o modelo do carro: ");
			String modelo = scan.next();
			
			System.out.println("Insira a placa do carro: ");
			String placa = scan.next();
			
			System.out.println("Insira a hora da chegada (24h)(hh mm):");
		    int horaDaEntrada = scan.nextInt();
		    int minutosDaEntrada = scan.nextInt();
		    
		    System.out.println("Insira a hora da saída (24h)(hh mm):");
		    int horaDaSaida = scan.nextInt();
		    int minutosDaSaida = scan.nextInt();
		    
		    int horasTotais = 0;
		    int minutosTotais = 0;
		    
		    if (horaDaEntrada <= horaDaSaida)
		    {
		        horasTotais = horaDaSaida - horaDaEntrada;
		        minutosTotais = minutosDaSaida - minutosDaEntrada;
		        
		        if (minutosTotais < 0) 
		        {
		            minutosTotais += 60;
		            horasTotais--;
		        }
		    } 
		    else 
		    {
		        horaDaSaida += 24; 
		        
		        horasTotais = horaDaSaida - horaDaEntrada;
		        minutosTotais = minutosDaSaida - minutosDaEntrada;
		        
		        if (minutosTotais < 0)
		        {
		            minutosTotais += 60;
		            horasTotais--;
		        }
		    }
		    
		    System.out.println("Tempo total: " + horasTotais + " horas e " + minutosTotais + " minutos.");
			
			double totalPagar = 0;
			if(horasTotais<=1) // calculo preço tempo estacionado
			{
				totalPagar = 5;
			}
			else if(horasTotais>3)
			{
				totalPagar = 15;
			}
			else
			{
				totalPagar = 10;
			}
			
			Veiculo veiculo = new Veiculo(placa, modelo, tamanho, vagaCadastro, horaDaEntrada, minutosDaEntrada, horaDaSaida, minutosDaSaida, horasTotais, minutosTotais, totalPagar);
			listaDeVeiculos.add(veiculo);

		}
		
	}
	
	public void exibirListaVeiculos() {
		
		for (Veiculo veiculo : listaDeVeiculos)
		{
			System.out.println(veiculo);
		}
		
	}
	
	public void exibirValores() { // relatorio financeiro
		
		double total = 0;
		for (Veiculo veiculo : listaDeVeiculos)
		{
			System.out.println("Veiculo: " + veiculo.getModelo() + ", placa: " + veiculo.getPlaca() + ", tempo: " + veiculo.getHorasTotais() + ":" + veiculo.getMinutosTotais() + ", valor: R$" + veiculo.getValorPagar());
			total+=veiculo.getValorPagar();
		}
		System.out.println("Total: R$" + total + "\n");
		
	}


}
