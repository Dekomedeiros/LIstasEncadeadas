package DuplamenteEncadeada;

import javax.swing.JOptionPane;

public class Lista {

    private No inicio;

    public void inserirInicio(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
        } else {
            novoNo.setProx(inicio);
            inicio.setAnt(novoNo);
            inicio = novoNo;
        }
    }

    public void inserirFim(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No noAux = inicio;

            while (noAux.getProx() != null) {
                noAux = noAux.getProx();
            }

            noAux.setProx(novoNo);
            novoNo.setAnt(noAux);
        }
    }

    public void inserirPosicaoEspecifica(No novoNo, int pos) {
        if (inicio == null) {
            inicio = novoNo;
        } else {
            No noAux = inicio;
            int contador = 0;
            No noAnt = null;

            if (pos == 0) {

                inicio.setAnt(novoNo);
                novoNo.setProx(inicio);
                inicio = novoNo;
            } else {
                while (noAux.getProx() != null && contador < pos) {
                    noAnt = noAux;
                    noAux = noAux.getProx();
                    contador++;
                }
                if (noAux.getProx() == null && contador < pos - 1) {
                    JOptionPane.showMessageDialog(null, "Posição inválida");
                } else {
                    noAnt.setProx(novoNo);
                    novoNo.setAnt(noAnt);
                    novoNo.setProx(noAux);
                    noAux.setAnt(novoNo);

                }
            }
        }
    }

    public void removerInicio() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            No noAux = inicio;
            inicio = inicio.getProx();
            noAux.setProx(null);
            inicio.setAnt(noAux);
        }
    }

    public void removerFim() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            No noAux = inicio;
            No noAnt = null;

            while (noAux.getProx() != null) {
                noAnt = noAux;
                noAux = noAux.getProx();
            }

            noAnt.setProx(null);
            noAux.setAnt(null);
        }
    }

    public void removerPosicaoEspecifica(int posR) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            No noAux = inicio;
            No noAnt = null;
            No noAux2 = inicio.getProx();
            
            int contador = 0;

            while (noAux.getProx() != null && contador < posR) {
                noAnt = noAux;
                noAux = noAux.getProx();
                noAux2 = noAux2.getProx();
                contador++;
            }
            if (noAux.getProx() == null && contador < posR - 1) {
                JOptionPane.showMessageDialog(null, "Posição Inválida");
            } else {
                noAux.setAnt(null);
                noAnt.setProx(null);
                noAux.setProx(null);
                noAux2.setAnt(null);
                noAnt.setProx(noAux2);
                noAux2.setAnt(noAnt);
            }

        }
    }

    public void Listar() {

        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            System.out.println("===========================");

            No noAux = inicio;
            while (noAux != null) {
                System.out.println(noAux.getValor());
                noAux = noAux.getProx();
            }
        }
    }
}
