package student.ugal.ro.avatar22;


/**
 *
 * @author db343
 */



package avatar;






public class Palarie extends Avatar {
    private String culoarePalarie;
    private int index;
    private String numePng;

    //const fara arg
    public Palarie() {
        super(); 
        this.culoarePalarie = " ";
        this.index = 0; 
        this.numePng = "Palarie_" + this.index + ".png";
    }

    // const cu toate arg
    public Palarie(int layer,  int pozitieX, int pozitieY, String culoarePalarie, int index) {
        super(layer,  pozitieX, pozitieY); 
        this.culoarePalarie = culoarePalarie;
        this.index = index;
        this.numePng = "Palarie_" + this.index + "_" + this.culoarePalarie + ".png"; 
    }

    // const de copiere
    public Palarie(Palarie pa) {
        super(p); 
        this.culoarePalarie = pa.culoarePalarie;
        this.index = pa.index;
        this.numePng = pa.numePng;
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
    public String getCuloarePalarie( ) {
        return culoarePalarie; 
    }
    public String setCuloarePalarie( String culoarePalarie) {
        this.culoarePalarie = culoarePalarie;
    }

          @Override
    // met ToString rescrisa
    public String toString() {
        return "Palarie: layer = " + getLayer()  + ", pozitieX = " + getPozitieX() + ", pozitieY = " + getPozitieY() + ", culoare palarie  = " + culoarePalarie + ", index = " + index + ", numePng = " + numePng;
    }

   
}



    



