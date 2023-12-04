package student.ugal.ro.avatar22;


/**
 *
 * @author db343
 */

package avatar;



/**
 *
 * @author db343
 */

public class Par extends Avatar {
    private String culoarePar;
    private int index;
    private String numePng;

    // const fara arg
    public Par() {
        super(); 
        this.culoarePar = " ";
        this.index = 0;
        this.numePng = "Par_" + this.index + ".png"; 
    }

    // const cu toate arg
    public Par(int layer,  int pozitieX, int pozitieY, String culoarePar, int index) {
        super(layer, pozitieX, pozitieY); 
        this.culoarePar = culoarePar;
        this.index = index;
        this.numePng = "Par_" + this.index + "_" + this.culoarePar + ".png"; 
    }

    // const de copiere
    public Par(Par p) {
        super(p); 
        this.culoarePar = culoarePar;
        this.index = p.index;
        this.numePng = p.numePng;
    }
 
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getNumePng() {
        return numePng;
    }

    public void setNumePng(String numePng) {
        this.numePng = numePng;
    }
    public void getCuloarePar( ) {
        return culoarePar;
    }
    public void setCuloarePar(String culoarePar) { 
        this.culoarePar=culoarePar;
    }
         
    // met ToString rescrisa
      @Override
    public String toString() {
        return "Par: layer = " + getLayer() + ",  pozitieX = " + getPozitieX() + ", pozitieY = " + getPozitieY() + ", culoarePar  = " + culoarePar + ", index = " + index + ", numePng = " + numePng;
    }

 }
