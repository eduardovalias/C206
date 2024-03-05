package Laboratorio.Aula2.Ex1;

public class Produto {
    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;

    void mostraInfo(int codigoSerie, String codigoProduto, String nome, String categoria, int quantidade){
        System.out.println(codigoSerie);
        System.out.println(codigoProduto);
        System.out.println(nome);
        System.out.println(categoria);
        System.out.println(quantidade);
    }
}
