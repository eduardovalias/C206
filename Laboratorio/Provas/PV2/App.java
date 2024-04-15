package Laboratorio.Provas.PV2;

public class App {
    public static void main(String[] args){
        Arma adaga = new Arma("Adaga", 4);
        Arma espada = new Arma("Espada", 12);

        Personagem[] personagens = new Personagem[3];

        personagens[0] = new Assassino("Talon", 50, 100, 80, adaga);
        personagens[1] = new Guerreiro("Garen", 200, 50, 80, espada);
        personagens[2] = new Mago("Newt", 30, 30, 350);

        personagens[0].atacar(personagens[2]);
        personagens[1].atacar(personagens[0]);
        personagens[2].usarHabilidade();
    }
}
