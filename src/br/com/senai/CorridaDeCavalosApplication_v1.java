package br.com.senai;

import java.util.Scanner;

public class CorridaDeCavalosApplication_v1 {
     public static void main(String[] args) {
        //Recursos
        Scanner sc = new Scanner(System.in);

        //Saudação
        System.out.println("Bem vindo ao jogo Corrida de Cavalos da Turma N-069!");

        //Aposta
        System.out.println("Escolha um cavalo de 1 a 8: ");
        int opcao = sc.nextInt();
        while (opcao < 1 || opcao > 8) {
            System.out.println("Digite um valor válido!");
            opcao = sc.nextInt();
        }
        sc.nextLine();//Para limpar o (\n) do buffer
        System.out.println("Você escolheu o cavalo " + opcao + ". Boa Sorte!");

        System.out.println("Pressione \"Enter\" para dar a largada!");
        sc.nextLine();

        //Comportamento do cavalo
        int tempo = 0;
        int[] posCavalos = new int[8];
        boolean continuarCorrendo = true;
        int vencedor = 0;
        while (continuarCorrendo) {
            tempo++;
            for (int i = 0; i < posCavalos.length; i++) {
                posCavalos[i] += Math.random() * 6;
                System.out.println("Posição do cavalo " + (i + 1) + ": " + posCavalos[i]);
                if (posCavalos[i] >= 100) {
                    vencedor = i + 1;
                    continuarCorrendo = false;
                }
            }
            if (tempo == 10) {
                System.out.println("Gostaria de mudar sua aposta? (sim/não)");
                String resposta = sc.next();
                sc.nextLine();//Para limpar o buffer
                if (resposta.equalsIgnoreCase("sim")) {

                    //Modificação da Aposta
                    System.out.println("Escolha um cavalo de 1 a 8: ");
                    opcao = sc.nextInt();
                    while (opcao < 1 || opcao > 8) {
                        System.out.println("Digite um valor válido!");
                        opcao = sc.nextInt();
                    }
                    sc.nextLine();//Para limpar o (\n) do buffer
                    System.out.println("Você escolheu o cavalo " + opcao + ". Boa Sorte!");
                }
            }
            if (continuarCorrendo) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
                System.out.println();
            }
        }

        //Finalização
        System.out.println("Fim de Jogo!");

        //Definição do vencedor
        System.out.println("O vencedor foi o Cavalo " + vencedor + "!");
        System.out.println("Você apostou no Cavalo = " + opcao + "!");
        if (opcao == vencedor) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você não ganhou!");
        }
    }
}
