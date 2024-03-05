package Laboratorio.Aula2.Ex1;

public class App {
    public static void main(String[] args){
        Produto p1 = new Produto();

        p1.codigoSerie = 13232;
        p1.codigoProduto = "Arr3";
        p1.nome = "Arroz";
        p1.categoria = "Alimento";
        p1.quantidade = 50;

        p1.mostraInfo(p1.codigoSerie, p1.codigoProduto, p1.nome, p1.categoria, p1.quantidade);
    }
}
