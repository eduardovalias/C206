package Laboratorio.Provas.PV1;

public class Pessoa {
    String nome;
    String cpf;
    int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
        System.out.println("Idade: "+ idade);
    }
}
