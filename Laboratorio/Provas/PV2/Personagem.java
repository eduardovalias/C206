package Laboratorio.Provas.PV2;

public abstract class Personagem implements LutarComArmas{
    private String nome;
    private int vida;
    private int energia;
    private int poder;

    public Personagem(String nome, int vida, int energia, int poder){
        this.nome = nome;
        this.vida = vida;
        this.energia = energia;
        this.poder = poder;
    }

    public void usarHabilidade(){
        System.out.print("Usando habilidade: ");
    }

    public void atacar(Personagem personagem){
        System.out.println("Personagem " + nome + " atacou " + personagem.getNome());
        System.out.println("Vida de " + personagem.getNome() + ": " + personagem.getVida());
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }
}
