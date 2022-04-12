public class Prodotto {
    protected String nome;
    protected double prezzo;
    protected String provenienza;
    
    public Prodotto(String nome, double prezzo, String provenienza) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.provenienza = provenienza;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    @Override
    public String toString() {
        return nome + ", prezzo=" + prezzo + ", provenienza=" + provenienza ;
    }


    
}
