import java.util.Calendar;
import java.util.GregorianCalendar;
public class Alimentare extends Prodotto{
    protected int annoScadenza;
    protected int meseScadenza;
    public Alimentare(String nome, double prezzo, String provenienza, int annoScadenza, int meseScadenza) {
        super(nome, prezzo, provenienza);
        this.annoScadenza = annoScadenza;
        this.meseScadenza = meseScadenza;
    }
    
    public int getAnnoScadenza() {
        return annoScadenza;
    }

    public void setAnnoScadenza(int annoScadenza) {
        this.annoScadenza = annoScadenza;
    }

    public int getMeseScadenza() {
        return meseScadenza;
    }

    public void setMeseScadenza(int meseScadenza) {
        this.meseScadenza = meseScadenza;
    }

    public boolean isScaduto()
    {
        Calendar calendar = new GregorianCalendar();

        if (( (this.getAnnoScadenza() < calendar.get(Calendar.YEAR) ) || (  (this.getMeseScadenza() < calendar.get(Calendar.MONTH) )&& (this.getAnnoScadenza() == calendar.get(Calendar.YEAR) ))))
        {
            //this.prezzo = getPrezzo()
            return true;
        }

        if ( (this.getMeseScadenza() == calendar.get(Calendar.MONTH)) && (this.getAnnoScadenza() == calendar.get(Calendar.YEAR) ) )
        {
            //this.prezzo = getPrezzo() - getPrezzo()/2;
            
        }
        //this.prezzo = getPrezzo() - getPrezzo()/10;
        return false;
    }
    public void applicaSconto ()
    {
        Calendar calendar = new GregorianCalendar();
        if (isScaduto())
        {
            this.prezzo = getPrezzo();
        }
        else if((this.getMeseScadenza() == calendar.get(Calendar.MONTH)) && (this.getAnnoScadenza() == calendar.get(Calendar.YEAR)))
        {
            this.prezzo = getPrezzo() - getPrezzo()/2;
        }
        else 
        {
            this.prezzo = getPrezzo() - getPrezzo()/10;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Alimentare: annoScadenza=" + annoScadenza + ", meseScadenza=" + meseScadenza;
    }

    
}
