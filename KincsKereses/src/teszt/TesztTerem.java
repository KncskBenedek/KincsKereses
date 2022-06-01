package teszt;

import modell.Terem;

public class TesztTerem {

    public static void main(String[] args) {
        new TesztTerem();
    }
    TesztTerem(){
        isMegtalalvaEltalal();
        System.out.println("--------------------");
        isMegtalalvaMelle();
    }
    public void isMegtalalvaEltalal() {
        System.out.println("isMegtalalva eltalál eset");
        Terem tesztTerem = new Terem();
        boolean eredmeny = tesztTerem.isMegtalalva(2);
        assert eredmeny == true : "isMegtalalva eltalált esetnél megbukott";
        System.out.println("isMegtalalva eltalál eset sikeres");
    }
    public void isMegtalalvaMelle() {
        System.out.println("isMegtalalva mellé eset");
        Terem tesztTerem = new Terem();
        boolean eredmeny = tesztTerem.isMegtalalva(1);
        assert eredmeny == false: "isMegtalalva mellé esetnél megbukott";
        System.out.println("isMegtalalva mellé eset sikeres");
    }
}
