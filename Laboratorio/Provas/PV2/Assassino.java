package Laboratorio.Provas.PV2;

public class Assassino extends Personagem{
    private Arma arma;

    public Assassino(String nome, int vida, int energia, int poder, Arma arma){
        super(nome, vida, energia, poder);
        this.arma = arma;
    }

    @Override
    public void atacar(Personagem personagem){
        personagem.setVida(personagem.getVida() - arma.getDano());
        super.atacar(personagem);
    }
}
