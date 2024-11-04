package principal;

import java.util.Scanner;

import objetos.Funcoes;

public class SistemaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Funcoes funcao = new Funcoes();
		
		Boolean menu = true;
		while(menu)
		{
			System.out.println("[1] cadastrar vaga \n[2] cadastrar veiculo \n[3] exibir vagas \n[4] exibir veiculos \n[5] financeiro \n[6] sair \nsua escolha: ");
			int esc = scan.nextInt();
			
			if(esc==1)
			{
				funcao.cadastrarVaga();
			}
			else if(esc==2)
			{
				funcao.cadastrarVeiculo();
			}
			else if(esc==3)
			{
				funcao.exibirListaVagas();
			}
			else if(esc==4)
			{
				funcao.exibirListaVeiculos();
			}
			else if(esc==5)
			{
				funcao.exibirValores();
			}
			else if(esc==6)
			{
				menu = false;
			}
			else
			{
				System.out.println("opção invalida.");
			}
		}

	}

}
