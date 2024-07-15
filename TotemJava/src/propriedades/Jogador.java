package propriedades;

public class Jogador {
    
    public String nome;
    public int total;
    public int ava;

    public Jogador(String nome, int total, int ava) {
        this.nome = nome;
        this.total = total;
        this.ava = ava;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAva() {
        return ava;
    }

    public void setAva(int ava) {
        this.ava = ava;
    }

}
