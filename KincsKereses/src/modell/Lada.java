package modell;

public class Lada {

    private Tipus tipus;
    private String tartalom;

    public Lada() {
        this("semmi");
    }

    protected Lada(Tipus tipus) {
        this(tipus,"semmi");
    }

    public Lada(String tartalom) {
        this(Tipus.fa, tartalom);
    }

    protected Lada(Tipus tipus, String tartalom) {
        this.tipus = tipus;
        this.tartalom = tartalom;
    }

    public Tipus getTipus() {
        return tipus;
    }

    public String getTartalom() {
        return tartalom;
    }
    
    
}
