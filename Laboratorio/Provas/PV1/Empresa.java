package Laboratorio.Provas.PV1;

import java.util.Scanner;

public class Empresa {
    String nome;
    String cnpj;
    String endereco;
    int funcionariosDisponiveis;
    int totalFuncionarios;
    int i = 0;
    Scanner pedido = new Scanner(System.in);
    Funcionario[] funcionarios = new Funcionario[10];

    public Empresa(String nome, String cnpj, String endereco, int funcionariosDisponiveis) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.funcionariosDisponiveis =  funcionariosDisponiveis;
    }

    void mostraInfo(){
        System.out.println(nome);
        System.out.println(cnpj);
        System.out.println(endereco);
        System.out.println("Funcionários disponíveis: " + funcionariosDisponiveis);
        System.out.println("Informações dos funcionários:");
    }

    void adicionarFuncionario(Funcionario[] funcionario){
        System.out.println("Digite a matrícula do funcionário");
        int matricula = pedido.nextInt();
        funcionario[i].matricula = matricula;
    }

    void alocarFuncionario(int index){
        System.out.println("Funcionário " + index + " alocado para a obra");
    }

    float contarFuncionariosDisponiveis(){
        return 100*funcionariosDisponiveis/totalFuncionarios;
    }
}
