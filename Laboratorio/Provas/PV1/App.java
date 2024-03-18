package Laboratorio.Provas.PV1;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Para mostrar informações da empresa, digite 1");
        System.out.println("Para adicionar funcionário, digite 2");
        System.out.println("Para alocar funcionario, digite 3");
        System.out.println("Para contar funcionários, digite 4");
        System.out.println("Para sair, digite 0");

        Scanner pedido = new Scanner(System.in);
        Scanner pedidoString = new Scanner(System.in);
        int escolha = pedido.nextInt();

        int funcionariosDisponiveis = 0;
        Funcionario[] funcionarios = new Funcionario[10];
        int totalFuncionarios = 0;

        int i = 0;

        Empresa empresa = new Empresa("Inatel", "1245", "R. de Santa Rita", funcionariosDisponiveis);

        while (escolha != 0){
            if(escolha == 1){
                empresa.mostraInfo();
                for(int k = 0; k < funcionarios.length; k++){
                    if(funcionarios[k] != null)
                        funcionarios[k].mostraInfo();
                }

            } else if (escolha == 2) {
                System.out.println("Digite o nome do Funcionario");
                String nome = pedidoString.nextLine();
                System.out.println("Digite o cpf do usuario");
                String cpf = pedidoString.nextLine();
                System.out.println("Digite a idade do funcionario");
                int idade = pedido.nextInt();
                funcionarios[i] = new Funcionario(nome, cpf, idade);
                i += 1;

                empresa.adicionarFuncionario(funcionarios);
                totalFuncionarios += 1;
                empresa.funcionariosDisponiveis = totalFuncionarios + funcionariosDisponiveis;

            } else if (escolha == 3) {
                System.out.println("Digite o índice do funcionario desejado");
                int index = pedido.nextInt();

                empresa.alocarFuncionario(index);
                funcionariosDisponiveis -= 1;
                empresa.funcionariosDisponiveis = totalFuncionarios + funcionariosDisponiveis;

            } else if (escolha == 4) {
                empresa.funcionariosDisponiveis = totalFuncionarios + funcionariosDisponiveis;
                empresa.totalFuncionarios = totalFuncionarios;
                System.out.println(empresa.contarFuncionariosDisponiveis() + "%");

            } else {
                System.out.println("Opção inválida");
            }

            System.out.println("Para mostrar informações da empresa, digite 1");
            System.out.println("Para adicionar funcionário, digite 2");
            System.out.println("Para alocar funcionario, digite 3");
            System.out.println("Para contar funcionários, digite 4");
            System.out.println("Para sair, digite 0");
            escolha = pedido.nextInt();

        }
    }
}
