package Teoria.PCMania;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente("Eduardo", 1234567890);

        MemoriaUSB memoriaUSB1 = new MemoriaUSB("Pen-drive", 16);
        MemoriaUSB memoriaUSB2 = new MemoriaUSB("Pen-drive", 32);
        MemoriaUSB memoriaUSB3 = new MemoriaUSB(" HD Externo", 1000);

        Computador promocao1 = new Computador("Pentium Core i3", "Memória RAM", "HD", 2200, 8, 500, " Linux Ubuntu", 32, "Positivo", 3300);
        Computador promocao2 = new Computador("Pentium Core i5", "Memória RAM", "HD", 3370, 16, 1000, "Windows 8", 64, "Acer", 8800);
        Computador promocao3 = new Computador("Pentium Core i7", "Memória RAM", "HD", 4500, 32, 2000, "Windows 10", 64, "Vaio", 4800);

        promocao1.addMemoriaUSB(memoriaUSB1);
        promocao2.addMemoriaUSB(memoriaUSB2);
        promocao3.addMemoriaUSB(memoriaUSB3);

        int op = 1;
        int confirmCompra;
        float valorPCS = 0;
        boolean comprado1 = false;
        boolean comprado2 = false;
        boolean comprado3 = false;

        while (op != 0){
            System.out.println("Olá " + cliente.nome + ", o que deseja comprar hoje?");
            System.out.println("Digite:");
            System.out.println("1 - Exibir informações da promoção 1");
            System.out.println("2 - Exibir informações da promoção 2");
            System.out.println("3 - Exibir informações da promoção 3");
            System.out.println("0 - Cancelar operação");
            op = entrada.nextInt();

            if(op == 1){
                promocao1.mostraPCConfigs();
                System.out.println("Para comprar, digite 1");
                System.out.println("Para cancelar, digite 2");
                confirmCompra = entrada.nextInt();
                if(confirmCompra == 1 && !comprado1){
                    valorPCS += promocao1.preco;
                    comprado1 = true;
                    System.out.println("Compra confirmada");
                } else if (comprado1) {
                    System.out.println("Você já resgatou essa promoção");
                } else {
                    System.out.println("Compra cancelada");
                }
            } else if (op == 2) {
                promocao2.mostraPCConfigs();
                System.out.println("Para comprar, digite 1");
                System.out.println("Para cancelar, digite 2");
                confirmCompra = entrada.nextInt();
                if(confirmCompra == 1 && !comprado2){
                    valorPCS += promocao2.preco;
                    comprado2 = true;
                    System.out.println("Compra confirmada");
                } else if (comprado2) {
                    System.out.println("Você já resgatou essa promoção");
                } else {
                    System.out.println("Compra cancelada");
                }
            } else if(op == 3){
                promocao3.mostraPCConfigs();
                System.out.println("Para comprar, digite 1");
                System.out.println("Para cancelar, digite 2");
                confirmCompra = entrada.nextInt();
                if(confirmCompra == 1 && !comprado3){
                    valorPCS += promocao3.preco;
                    comprado3 = true;
                    System.out.println("Compra confirmada");
                } else if(comprado3) {
                    System.out.println("Você já resgatou essa promoção");
                } else {
                    System.out.println("Compra cancelada ");
                }
            } else if (op == 0) {

            } else {
                System.out.println("Operador inválido");
            }
        }

        System.out.println(cliente.nome + " CPF: " + cliente.cpf);
        System.out.println("PC's adquiridos: ");
        if (comprado1)
            promocao1.mostraPCConfigs();
        if (comprado2)
            promocao2.mostraPCConfigs();
        if (comprado3)
            promocao3.mostraPCConfigs();

        System.out.println("Total das compras: R$" + String.format("%.2f", cliente.calculaTotalCompra(valorPCS)));
        }
    }

