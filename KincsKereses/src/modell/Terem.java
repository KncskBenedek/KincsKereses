
package modell;


public class Terem {
    private int ferohely;
    private KincsesLada[] kincsesLadak;
    private boolean megtalalva;
    private String leiras;

    public Terem(int ferohely, String leiras) {
        this.ferohely = ferohely;
        kincsesLadak = new KincsesLada[this.ferohely];
        kincsesLadak = alapLadak();
        this.leiras = leiras;
        megtalalva = false;
    }



    public Terem(int ferohely) {
        this(ferohely, "3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat, de csak az egyik láda állítása igaz!");
    }

    public Terem() {
        this(3);
    }
    
    
    
    
    public boolean bekeres(int poz){
        return false;
    }
    public void jatek(){
        
    }
    public KincsesLada[] alapLadak(){
        return null;
    }
}
