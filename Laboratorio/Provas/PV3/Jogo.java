package Laboratorio.Provas.PV3;

public class Jogo {
    private String nome;
    private double preco;
    private String genero;

    public Jogo(String nome, double preco, String genero){
        this.nome = nome;
        this.preco = preco;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getGenero() {
        return genero;
    }
}
