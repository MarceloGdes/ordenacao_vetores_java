package org.example;

import javax.swing.*;
import java.sql.Array;

public class Vetor {

    public int[] vetor;
    public int[] vetorOrdenado;


    public void criarVetor(){
        int num = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite o tamanho do vetor"
        ));

        if(num <= 0){
            JOptionPane.showMessageDialog(null, "Valor insirido  é menor ou igual a zero, digite outro valor");
            return;
        }
        vetor = new int[num];
        JOptionPane.showMessageDialog(null, "Vetor criado");

    }

    public void addValoresNoVetor() {
        if(vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor ainda não criado, crie o vetor primeiro");
            return;
        }

        for (int i = 0; i <vetor.length; i++) {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Insira o valor inteiro para a posição: " + i + " do vetor"
            ));
            vetor[i] = valor;
        }
    }

    public void mostrarVetores(int[] vetorOriginal, int[] vetorOrdenado){

        String msgVetorOriginal = "Vetor antigo: ";
        for (int i = 0; i < vetorOriginal.length; i++) {
            msgVetorOriginal += vetorOriginal[i];
            if(i < vetorOriginal.length-1){
                msgVetorOriginal += ", ";
            }

        }

        String msgVetorOrdenado = "\nVetor ordenado: ";
        for (int i = 0; i < vetorOrdenado.length; i++) {
            msgVetorOrdenado += vetorOrdenado[i];
            if(i < vetorOrdenado.length-1){
                msgVetorOrdenado += ", ";
            }

        }

        JOptionPane.showMessageDialog(
                null,
                msgVetorOriginal + msgVetorOrdenado
        );
    }

    public void ordInsercao() {
        if(vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor ainda não criado, crie o vetor primeiro");
            return;
        }

        int[] vetorDesordenado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorDesordenado[i] = vetor[i];
        }



        int chave;
        int j;

        for (int i = 1; i < vetorDesordenado.length; i++) {
            chave = vetorDesordenado[i];

            for (j = i - 1; (j >= 0 && vetorDesordenado[j] > chave) ; j--) {
               vetorDesordenado[j+1] = vetorDesordenado[j];
            }

            vetorDesordenado[j+1] = chave;
        }

        this.vetorOrdenado = vetorDesordenado;

        mostrarVetores(this.vetor, vetorOrdenado);

    }



    public void ordSelecao() {

        if(vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor ainda não criado, crie o vetor primeiro");
            return;
        }

        int[] vetorDesordenado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorDesordenado[i] = vetor[i];
        }


        for (int i = 0; i <vetorDesordenado.length; i++) {
            int menorPosi = i;

            for (int j = i + 1; j < vetorDesordenado.length; j++) {

                if(vetorDesordenado[j] < vetorDesordenado[menorPosi]) {
                    menorPosi = j;
                }

            }

            if(menorPosi != i) {
                int aux = vetorDesordenado[i];
                vetorDesordenado[i] = vetorDesordenado[menorPosi];
                vetorDesordenado[menorPosi] =  aux;
            }

        }

        this.vetorOrdenado = vetorDesordenado;
        mostrarVetores(this.vetor, vetorOrdenado);
    }

    public void ordBolha() {

        if(vetor == null) {
            JOptionPane.showMessageDialog(null, "Vetor ainda não criado, crie o vetor primeiro");
            return;
        }

        int[] vetorDesordenado = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {
            vetorDesordenado[i] = vetor[i];
        }



        boolean trocou = true;

        while (trocou) {

            trocou = false;
            for (int i = 0; i < vetorDesordenado.length - 1; i++) {
                if(vetorDesordenado[i] > vetorDesordenado[i+1]) {
                    int aux = vetorDesordenado[i];
                    vetorDesordenado[i] = vetorDesordenado[i+1];
                    vetorDesordenado[i+1] =aux;
                    trocou = true;
                }
            }
        }


        this.vetorOrdenado = vetorDesordenado;
        mostrarVetores(this.vetor, vetorOrdenado);
    }

}
