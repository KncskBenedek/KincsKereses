package teszt;

import modell.Terem;

public class TesztTerem {

    public static void main(String[] args) {
        new TesztTerem();
    }
    TesztTerem(){
        isMegtalalvaEltalal();
    }
    public void isMegtalalvaEltalal() {
        System.out.println("isMegtalalva eltalál eset");
        Terem tesztTerem = new Terem();
        boolean eredmeny = tesztTerem.isMegtalalva();
        assert eredmeny == true : "isMegtalalva eltalált esetnél megbukott";
        System.out.println("isMegtalalva eltalál eset sikeres");
    }
}
