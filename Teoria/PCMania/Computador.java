package Teoria.PCMania;

public class Computador {
    String marca;
    float preco;
    HardwareBasico processador;
    HardwareBasico ram;
    HardwareBasico hd;
    SistemaOperacional sistemaOperacional;
    MemoriaUSB musb;

    public Computador(String proc, String mem, String arm, int capacidadeProc, int capacidadeRAM, int capacidadeHD, String nomeSO, int tipo, String marca, float preco){
       processador = new HardwareBasico(proc, capacidadeProc);
       ram = new HardwareBasico(mem, capacidadeRAM);
       hd = new HardwareBasico(arm, capacidadeHD);
       sistemaOperacional = new SistemaOperacional(nomeSO, tipo);
       this.marca = marca;
       this.preco = preco;
    }

    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preco: R$" + String.format("%.2f", preco));
        System.out.println("Processador: " + processador.nome + " (" + String.format("%.0f", processador.capacidade) + " Mhz)");
        System.out.println("Memória: " + String.format("%.0f", ram.capacidade) + " GB de " + ram.nome);
        if(hd.capacidade/1000 < 1)
            System.out.println("Armazenamento: " + hd.nome + " de " + String.format("%.0f",hd.capacidade) + "Gb");
        else
            System.out.println("Armazenamento: " + hd.nome + " de " + String.format("%.0f", hd.capacidade/1000) + "Tb");
        System.out.println("Sistema operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        if(musb.capacidade/1000 < 1)
            System.out.println("Acompanha: " + musb.nome + " de " + musb.capacidade + "Gb");
        else
            System.out.println("Acompanha: " + musb.nome + " de " + musb.capacidade/1000 + "Tb");
    }

    void addMemoriaUSB(MemoriaUSB musb){
        this.musb = musb;
    }
}
