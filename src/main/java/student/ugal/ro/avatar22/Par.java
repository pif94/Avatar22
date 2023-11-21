package student.ugal.ro.avatar22;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author db343
 */
public class Par extends Avatar {

    private String culoarePar;

    // const fara arg
    public Par()
    {
        super();
        this.culoarePar = culoarePar;
    }

    // const cu toate argumentele
    public Par(int layer, int pozitieX, int pozitieY, String culoarePar)
    {
        super(layer, pozitieX, pozitieY);
        this.culoarePar = culoarePar;
    }

    // const de copiere
    public Par(Par p)
    {
       
        this.culoarePar = p.culoarePar;
    }

    // met 
    public String getCuloarePar()
    {
        return culoarePar;
    }

    public void setCuloarePar(String culoarePar)
    {
        this.culoarePar = culoarePar;
    }

    // met toString rescrisa
    @Override

    public String toString()
    {
        return "Par: layer = " + getLayer() + ", pozitieX = " + getPozitieX() + ", pozitieY = " + getPozitieY() + ", culoare par = " + getCuloarePar();
    }

    // alegere par din imaginile png
    /* 
        public void alegePar(String numeFisier) throws IOException {
        File fisierPar = new File(numeFisier); 
        BufferedImage par = ImageIO.read(fisierPar);
    }
     */
}
