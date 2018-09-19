package DuplamenteEncadeada;

import javax.swing.JOptionPane;

public class Principal {
    
    public static void main(String[] args) {
        
        No novoNo;
        Lista lista = new Lista();
        
        int menu = 1;
        while(menu>0){
            menu = Integer.parseInt(JOptionPane.showInputDialog("Informe uma opção do menu: \n"
            + "1) Inserir no Inicio. \n"
            + "2) Inserir no Fim. \n"
            + "3) Inserir em uma posiçao específica. \n"
            + "4) Remover do Inicio. \n"
            + "5) Remover do Fim. \n"
            + "6) Remover de uma posição específica. \n"
            + "7) Listar."));
            
            switch(menu){
                case 1:
                    novoNo = new No();
                    novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado")));
                    lista.inserirInicio(novoNo);
                    break;
                    
                case 2:
                    novoNo = new No();
                    novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado")));
                    lista.inserirFim(novoNo);
                    break;
                    
                case 3:
                    novoNo = new No();
                    int pos = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição desejada"));
                    novoNo.setValor(Integer.parseInt(JOptionPane.showInputDialog("Informe o valor desejado")));
                    lista.inserirPosicaoEspecifica(novoNo, pos);
                    
                    break;
                    
                case 4:
                    lista.removerInicio();
                    
                    break;
                    
                case 5:
                    lista.removerFim();
                    
                    break;
                    
                case 6:
                    int posR = Integer.parseInt(JOptionPane.showInputDialog("Informe a posição desejada"));
                    lista.removerPosicaoEspecifica(posR);
                    break;
                    
                case 7:
                    lista.Listar();
                    break;
            }
        }
    }
}
