package EncadeadaDescritor;

import javax.swing.JOptionPane;

public class Lista {

    private No inicio;
    private No fim;
    private int qnt;

    public void inserirInicio(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
            fim = null;
            qnt++;
        } else {
            fim = inicio;
            novoNo.setProx(inicio);
            inicio = novoNo;
            qnt++;
        }
    }

    public void inserirFim(No novoNo) {
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            qnt++;
        } else {
            fim.setProx(novoNo);
            qnt++;
            fim = novoNo;
        }
    }

    public void removerInicio() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            No noAux = inicio;
            inicio = inicio.getProx();
            noAux.setProx(null);
            qnt--;
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
            fim = noAnt;
            noAnt.setProx(null);
            qnt--;
        }
    }

    public void inserirPosicaoEspecifica(No novoNo, int pos) {
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
            qnt++;
        } else {
            if (pos == 0) {
                novoNo.setProx(inicio);
                inicio = novoNo;
            } else {
                if (pos <= qnt) {
                    No noAux = inicio;
                    int contador = 0;

                    while (noAux.getProx() != null && contador < pos - 1) {
                        noAux = noAux.getProx();
                        contador++;
                    }
                    novoNo.setProx(noAux.getProx());
                    noAux.setProx(novoNo);
                    qnt++;
                } else {
                    JOptionPane.showMessageDialog(null, "Posiçao invalida");
                }
            }
        }
    }

    public void removerPosicaoEspecifica(int posR) {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            No noAux = inicio;
            int contador = 0;
            No noAnt = null;

            if (posR == 0) {
                inicio = inicio.getProx();
                noAux.setProx(null);
                qnt--;
            } else {
                if (posR == qnt - 1) {
                    while (noAux.getProx() != null) {
                        noAnt = noAux;
                        noAux = noAux.getProx();
                        //contador++;
                    }
                    fim = noAnt;
                    noAnt.setProx(null);
                    qnt--;
                } else {
                    if (posR < qnt) {
                        while (noAux.getProx() != null && contador < posR - 1) {
                            noAnt = noAux;
                            noAux = noAux.getProx();
                            contador++;
                        }

                    }
                }
            }
        }
    }

    public void Listar() {
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "Lista Vazia");
        } else {
            System.out.println("===================================");

            No noAux = inicio;
            while (noAux != null) {
                System.out.println(noAux.getValor());
                noAux = noAux.getProx();
            }
        }
    }
}
