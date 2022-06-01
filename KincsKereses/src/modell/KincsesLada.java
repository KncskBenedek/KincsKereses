
package modell;


public class KincsesLada extends Lada{
    private   String felirat;

    public KincsesLada(Tipus tipus, String[] tartalom, String felirat) { 
        super(tipus, tartalom);
        
        this.felirat = felirat;
    }

   
    public KincsesLada(Tipus tipus, String felirat){
        super(tipus);
        this.felirat = felirat;
    }
}
