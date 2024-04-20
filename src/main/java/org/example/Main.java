package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Vetor vetor = new Vetor();
        int opcao = -1;


        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Selecione uma das opções abaixo:\n" +
                            "1 - Inserir o tamanho do vetor\n"+
                            "2 - Adicionar valores no vetor\n"+
                            "3 - Ordenar vetor\n"+
                            "0 - Sair"
            ));

            switch (opcao) {
                case 1:
                    vetor.criarVetor();
                    break;
                case 2:
                    vetor.addValoresNoVetor();
                    break;
                case 3:
                    int subOpcoes = Integer.parseInt(JOptionPane.showInputDialog(
                            "Selecione o metodo de ordenação:\n" +
                                    "1 - Ordenação por inserção\n"+
                                    "2 - Ordenação por seleção\n"+
                                    "3 - Ordenação bolha\n"+
                                    "0 - Sair"
                    ));
                    switch (subOpcoes) {
                        case 1:
                            vetor.ordInsercao();
                            break;
                        case 2:
                            vetor.ordSelecao();
                            break;
                        case 3:
                            vetor.ordBolha();
                    }

                    break;
            }


        }while (opcao != 0);



    }


}