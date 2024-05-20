package Laboratorio.Provas.PV3;

import javax.swing.*;
import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int index;
        Scanner sc = new Scanner(System.in);
        Arquivo arquivo = new Arquivo();

        System.out.println("Digite:");
        System.out.println("1 para adicionar jogos");
        System.out.println("2 para mostrar informações dos jogos salvos no arquivo");
        System.out.println("3 para ordenar em ordem crescente de preço");
        System.out.println("4 para ordenar em ordem decrescente de preço");
        System.out.println("0 para cancelar operação");

        index = sc.nextInt();
        while(index != 0){
            if(index == 1){
                System.out.println("Digite o preco do jogo");
                double preco = sc.nextDouble();
                try{
                    if(preco <= 0){
                        throw new PrecoNegativoException("Preço inválido");
                    }
                } catch (PrecoNegativoException ex){
                    System.err.printf("PrecoNegativoExeption: %s.%n", ex);
                    break;
                }

                sc.nextLine();

                System.out.println("Digite o nome do jogo");
                String nome = sc.nextLine();

                System.out.println("Digite o genero desse jogo");
                String genero = sc.nextLine();

                Jogo jogo = new Jogo(nome, preco, genero);

                arquivo.escrever(jogo);
                JOptionPane.showMessageDialog(null, "Jogo adicionado");
            } else if (index == 2) {
                arquivo.ler();
                JOptionPane.showMessageDialog(null, "Todos os arquivos foram lidos");
            } else if (index == 3) {
                JOptionPane.showMessageDialog(null, "Ordenação condluída");
            } else if (index == 4) {
                JOptionPane.showMessageDialog(null, "Ordenação concluída");
            } else if (index == 0) {
                JOptionPane.showMessageDialog(null, "Operação cancelada");
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido");
            }

            System.out.println("Digite:");
            System.out.println("1 para adicionar jogos");
            System.out.println("2 para mostrar informações dos jogos salvos no arquivo");
            System.out.println("3 para ordenar em ordem crescente de preço");
            System.out.println("4 para ordenar em ordem decrescente de preço");
            System.out.println("0 para cancelar operação");

            index = sc.nextInt();
        }

    }
}
