package modell;

public class Terem {

    private int ferohely;
    private KincsesLada[] kincsesLadak;
    private boolean megtalalva;
    private String leiras;

    private  Terem(int ferohely, String leiras) {
        this.ferohely = ferohely;
        alapHaromLada();
        this.leiras = leiras;
        megtalalva = false;
    }

    private  Terem(int ferohely) {
        this(ferohely, (ferohely + " láda közül az egyik rejti a kincset. Mindegyiken van "
                + "egy felirat, de csak az egyik láda állítása igaz!"));
    }

    public Terem() {
        this(3);
    }

    public boolean bekeres(int poz) {
        return false;
    }

    public void jatek() {

    }

    private  void alapHaromLada() {
        kincsesLadak = new KincsesLada[]{new KincsesLada(Tipus.arany,"én rejtem a kincset"),
        new KincsesLada(Tipus.ezüst,"nem én rejtem a kincset"),
        new KincsesLada(Tipus.bronz, "az arany hazudik", "kincs")};
        
    }

    public KincsesLada[] getKincsesLadak() {
        return kincsesLadak;
    }

    public boolean isMegtalalva() {
        return megtalalva;
    }

    public String getLeiras() {
        return leiras;
    }
    
}
