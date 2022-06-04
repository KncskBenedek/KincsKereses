package modell;

public class Terem {

    private KincsesLada[] kincsesLadak;
    private boolean megtalalva;
    private String leiras;
    private int probalkozasok;

    private Terem(String leiras) {

        alapHaromLada();
        this.leiras = leiras;
        megtalalva = false;
        probalkozasok = 0;
    }

    public Terem() {
        this("3 láda közül az egyik rejti a kincset. Mindegyiken van "
                + "egy felirat, de csak az egyik láda állítása igaz!"
                + "Találd ki melyikben van a kincs!");
    }

    private void alapHaromLada() {
        kincsesLadak = new KincsesLada[]{new KincsesLada(Tipus.arany, "én rejtem a kincset"),
            new KincsesLada(Tipus.ezüst, "nem én rejtem a kincset"),
            new KincsesLada(Tipus.bronz, Lada.KINCS, "az arany hazudik")};

    }

    public KincsesLada[] getKincsesLadak() {
        return kincsesLadak;
    }

    public boolean isMegtalalva(int poz) {
        boolean allapot = kincsesLadak[poz].getTartalom().equals(Lada.KINCS);
        if (allapot) {
            this.megtalalva = allapot;
        }
        probalkozasok++;
        return megtalalva;
    }

    public boolean isMegtalalva() {
        return megtalalva;
    }

    public int getProbalkozasok() {
        return probalkozasok;
    }

    public String getLeiras() {
        return leiras;
    }

}
