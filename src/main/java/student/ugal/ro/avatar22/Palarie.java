package student.ugal.ro.avatar22;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author db343
 */


public class Palarie extends Avatar {

    private String culoarePalarie;

    //consr fara arg
    public Palarie()
    {
        super();
        this.culoarePalarie = culoarePalarie;
    }

    // const cu toate arg
    public Palarie(int layer, int pozitieX, int pozitieY, String culoarePalarie)
    {
        super(layer, pozitieX, pozitieY); // apeleaza constructorul cu toate argumentele al superclasei
        this.culoarePalarie = culoarePalarie;
    }

    // const de copiere
    public Palarie(Palarie pa)
    {
        
        this.culoarePalarie = pa.culoarePalarie;
    }

    public String getCuloarePalarie()
    {
        return culoarePalarie;
    }

    public void setCuloarePalarie(String culoarePalarie)
    {
        this.culoarePalarie = culoarePalarie;
    }

    // mett toString rescrisa
    @Override
    public String toString()
    {
        return "Palarie: layer = " + getLayer() + ", pozitieX = " + getPozitieX() + ", pozitieY = " + getPozitieY() + ", culoare palarie = " + getCuloarePalarie();
    }

    // met alegere palarie din imag png
    /*
    public void alegePalarie(String numeFisier) throws IOException {
        File fisierPalarie = new File(numeFisier); 
        BufferedImage palarie = ImageIO.read(fisierPalarie);
    }
     */
}
