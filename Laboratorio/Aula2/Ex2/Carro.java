package Laboratorio.Aula2.Ex2;

public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    void ligar(){
        System.out.println("Ligando...");
    }

    void acelerar(){
        System.out.println("Acelerando...");
    }

    void mostrarinfo(int potencia, String tipo){
        System.out.println("Informações do carro:");
        System.out.println(cor);
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(velocidadeMax);
        System.out.println(velocidadeAtual);

        System.out.println("Informações do motor:");
        System.out.println(potencia);
        System.out.println(tipo);
    }
}
