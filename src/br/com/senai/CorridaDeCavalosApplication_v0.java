package br.com.senai;

import java.util.Scanner;

public class CorridaDeCavalosApplication_v0 {
    public static void main(String[] args) {
        //Corrida de cavalos com oito participantes e um apostador;
        //Os apostados escolhem um cavalo;
        //Definir o comprimento da pista (da largada ate a linha de chegada) de 100 mc;
        //Os cavalos se movem a cada umt, uma distancia aleatoria de 0 a 5 umc;
        //Vence o cavalo que cruzar a linha de chegada primeiro;
        //Apresentar o resultado do jogo.

        //Recurso
        Scanner sc = new Scanner(System.in);

        //Saudação
        System.out.println("Bem vindo ao jogo de Cavalos da Turma N-069");

        //Aposta
        System.out.println("Escolha um cavalo de 1 a 8: ");
        int opcao = sc.nextInt();
        while (opcao < 1 || opcao > 8) {
            System.out.println("Digite um valor válido! ");
            opcao = sc.nextInt();
            sc.nextLine();
        }
        sc.nextLine();
        System.out.println("Você escolheu o cavalo " + opcao + ". Boa Sorte!");

        System.out.println("Pressione \"Enter\" para dar a largada!");
        sc.nextLine();

        //Comportamento do cavalo
        int tempo = 0;
        int posCavalo1 = 0;
        int posCavalo2 = 0;
        int posCavalo3 = 0;
        int posCavalo4 = 0;
        int posCavalo5 = 0;
        int posCavalo6 = 0;
        int posCavalo7 = 0;
        int posCavalo8 = 0;

        while (
                        posCavalo1 < 100 &&
                        posCavalo2 < 100 &&
                        posCavalo3 < 100 &&
                        posCavalo4 < 100 &&
                        posCavalo5 < 100 &&
                        posCavalo6 < 100 &&
                        posCavalo7 < 100 &&
                        posCavalo8 < 100) {
            tempo++;
            posCavalo1 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo1);
            posCavalo2 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo2);
            posCavalo3 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo3);
            posCavalo4 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo4);
            posCavalo5 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo5);
            posCavalo6 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo6);
            posCavalo7 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo7);
            posCavalo8 += Math.random() * 6;
            System.out.println("Posição do cavalo 1: " + posCavalo8);

            if (tempo == 10) {
                System.out.println("Gostaria de mudar a sua aposta? (sim/não)");
                String resposta = sc.next();
                sc.nextLine(); //Para limpar o buffer
                if (resposta.equalsIgnoreCase("sim")) {
                    //Aposta
                    System.out.println("Escolha um cavalo de 1 a 8: ");
                    opcao = sc.nextInt();
                    sc.nextLine(); //Para limpar o (\n) do buffer
                    System.out.println("Você escolheu o cavalo " + opcao + ". Boa Sorte!");
                }

                if (
                        posCavalo1 < 100 &&
                        posCavalo2 < 100 &&
                        posCavalo3 < 100 &&
                        posCavalo4 < 100 &&
                        posCavalo5 < 100 &&
                        posCavalo6 < 100 &&
                        posCavalo7 < 100 &&
                        posCavalo8 < 100) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println();
                }
            }
            //Finalização
            System.out.println("Fim do jogo");
        }
    }
}
