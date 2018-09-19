package EncadeadaDescritor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		No novoNo;
		Lista lista = new Lista();
		
		int menu = 1;
		while(menu>0) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Informe a opçao do menu \n"
					+ "1) Inserir no inicio \n"
					+ "2) Inserir no fim \n"
					+ "3) Inserir na Posiçao Especifica \n"
					+ "4) Remover do inicio \n "
					+ "5) Remover do Fim \n"
					+ "6) Remover da Posiçao Especifica \n"
					+ "7) Listar os elementos \n"
					+ "Zero ou menos para sair"));
			
			switch(menu) {
			case 1:
				novoNo = new No();
				novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado")));
				lista.inserirInicio(novoNo);
				break;
				
			case 2:
				novoNo = new No();
				novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado")));
				lista.inserirFim(novoNo);
				break;
				
			case 3:
				novoNo = new No();
				novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor desejado")));
				int pos = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da posiçao desejada"));
				lista.inserirPosicaoEspecifica(novoNo, pos);
				break;
				
			case 4:
				lista.removerInicio();
				break;
				
			case 5:
				lista.removerFim();
				break;
				
			case 6:
                                int posR = Integer.parseInt(JOptionPane.showInputDialog("Insir a posição desejada"));
                                lista.removerPosicaoEspecifica(posR);
				break;
				
			case 7:
				lista.Listar();
				break;
				
			case 0:
				break;
			}
		}
	}
}
