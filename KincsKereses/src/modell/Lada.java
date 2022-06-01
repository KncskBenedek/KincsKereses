package modell;

public class Lada {
    public static final String KINCS = "kincs", SEMMI = "semmi";
    private Tipus tipus;
    private String tartalom;

    public Lada() {
        this(Lada.SEMMI);
    }

    protected Lada(Tipus tipus) {
        this(tipus,Lada.SEMMI);
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
