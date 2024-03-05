package Laboratorio.Aula2.Ex2;

public class App {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        Motor motor1 = new Motor();

        carro1.cor = "Vermelho";
        carro1.marca = "Ferrari";
        carro1.modelo = "Portofino";
        carro1.velocidadeMax = 320;
        carro1.velocidadeAtual = 250;
        motor1.potencia = 620;
        motor1.tipo = "V8";

        carro1.ligar();
        carro1.acelerar();
        carro1.mostrarinfo(motor1.potencia, motor1.tipo);

    }
}
