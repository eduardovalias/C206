package Laboratorio.Provas.PV3;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Arquivo {
    public void escrever(Jogo jogo){
        OutputStream fluxoSaida = null;
        OutputStreamWriter geradorFluxoSaida = null;
        BufferedWriter bufferSaida = null;
        String linha = null;
        try{
            fluxoSaida = new FileOutputStream("D:\\Inatel\\jogos.txt", true);
            geradorFluxoSaida = new OutputStreamWriter(fluxoSaida);
            bufferSaida = new BufferedWriter(geradorFluxoSaida);
            linha = jogo.getNome() + "\n" + jogo.getPreco() + "\n" + jogo.getGenero() + "\n";
            bufferSaida.write(linha);
            bufferSaida.newLine();
        } catch (FileNotFoundException ex) {
            System.err.printf("FileNotFoundException: %s.%n", ex);
        } catch (IOException ex) {
            System.err.printf("IOException: %s.%n", ex);
        } finally {
            try{
                bufferSaida.close();
            } catch (IOException ex){
                System.err.println("IOException: %s.%n");
            }
        }
    }

    public ArrayList<Jogo> ler(){
        InputStream fluxoEntrada = null;
        InputStreamReader leitorFluxoEntrada = null;
        BufferedReader bufferEntrada = null;
        String linha = null;
        try {
            fluxoEntrada = new FileInputStream("D:\\Inatel\\jogos.txt");
            leitorFluxoEntrada = new InputStreamReader(fluxoEntrada);
            bufferEntrada = new BufferedReader(leitorFluxoEntrada);
            linha = bufferEntrada.readLine();
            while(linha != null){
                System.out.println(linha);
                linha = bufferEntrada.readLine();
            }
        } catch (FileNotFoundException ex){
            System.err.printf("FileNotFoundException: %s.%n", ex);
        } catch (IOException ex){
            System.err.printf("IOException: %s.%n", ex);
        } finally {
            try{
                bufferEntrada.close();
            } catch (IOException ex){
                System.err.printf("IOException: %s.%n", ex);
            }
        }
        return null;
    }
}
