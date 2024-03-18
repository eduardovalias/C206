package Laboratorio.Provas.PV1;

public class Funcionario {
    int matricula;
    Pessoa pessoa;

    public Funcionario(String nome, String cpf, int idade){
        pessoa = new Pessoa(nome, cpf, idade);
    }

    void mostraInfo(){
        System.out.println("Matrícula: " + matricula);
        pessoa.mostraInfo();
    }
}
