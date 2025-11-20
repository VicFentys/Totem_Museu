package propriedades;

import java.io.*;
import java.util.ArrayList;

public class GameData {
    
    public static void saveGameData(ArrayList<Jogador> jogadores) {
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/propriedades/jogadores.txt"))) {
            for (Jogador j : jogadores) {
                bw.write(j.getNome() + ", " + j.getTotal() + ", " + j.getAva());
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Erro ao salvar: " + ex.getMessage());
        }
    }
    
    public static ArrayList<Jogador> loadGameData() {
        ArrayList<Jogador> jogadores = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/propriedades/jogadores.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length == 3) {
                    String nome = parts[0];
                    int pontos = Integer.parseInt(parts[1]);
                    int avaliacao = Integer.parseInt(parts[2]);
                    jogadores.add(new Jogador(nome, pontos, avaliacao));
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro ao carregar: " + ex.getMessage());
        }
        return jogadores;
    }
    
}
