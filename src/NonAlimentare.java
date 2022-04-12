public class NonAlimentare extends Prodotto{
    protected String materialePrincipale;
    protected boolean riciclabile;

    public NonAlimentare(String nome, double prezzo, String provenienza, String materialePrincipale,
            boolean riciclabile) {
        super(nome, prezzo, provenienza);
        this.materialePrincipale = materialePrincipale;
        this.riciclabile = riciclabile;
    }

    public String getMaterialePrincipale() {
        return materialePrincipale;
    }

    public void setMaterialePrincipale(String materialePrincipale) {
        this.materialePrincipale = materialePrincipale;
    }

    public boolean isRiciclabile() {
        return riciclabile;
    }

    public void setRiciclabile(boolean riciclabile) {
        this.riciclabile = riciclabile;
    }
    
    public void applicaSconto()
    {
        if (isRiciclabile())
        {
            this.prezzo = getPrezzo() - (getPrezzo()/100)*15;
            return ;
        }
        this.prezzo = getPrezzo() - getPrezzo()/10;
    }
    
}
