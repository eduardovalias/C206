package Laboratorio.Provas.PV2;

public class Mago extends Personagem {

    public Mago(String nome, int vida, int energia, int poder){
        super(nome, vida, energia, poder);
    }

    @Override
    public void usarHabilidade(){
        super.usarHabilidade();
        System.out.println("bola de fogo");
    }
}
