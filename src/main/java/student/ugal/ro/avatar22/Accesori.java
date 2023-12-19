package student.ugal.ro.avatar22;

/**
 *
 * @author vn177
 */
public class Accesori extends Avatar {

    private boolean gros;
    private String color;
    private boolean mirrored;
    private int index;
    private String numePng;

    public Accesori()
    {
        super();
        this.gros=false;
        this.color="";
        this.mirrored=false;
        this.index=0;
        this.numePng="";
    }

   /* public Accesori(String color, boolean mirrored, int index, String numePng)
    {
        this.gros=false;
        this.color = color;
        this.mirrored = mirrored;
        this.index = index;
        this.numePng = numePng;
    }
    */
    

    public Accesori(boolean gros, boolean mirrored, int index, String color, int layer,  int pozitieX, int pozitieY)
    {   
        super(layer, pozitieX, pozitieY);
        this.gros = gros;
        this.color = color;
        this.mirrored = mirrored;
        this.index = index;
        this.numePng = "accesorii_"+this.index+"_"+this.color+".png";
    }

    public Accesori(Accesori Ac)
    {
        super(Ac);
        this.gros = Ac.gros;
        this.color = Ac.color;
        this.mirrored = Ac.mirrored;
        this.index = Ac.index;
        this.numePng = Ac.numePng;
    }

    public boolean isGros()
    {
        return gros;
    }

    public void setGros(boolean gros)
    {
        this.gros = gros;
    }

    public boolean isMirrored()
    {
        return mirrored;
    }

    public void setMirrored(boolean mirrored)
    {
        this.mirrored = mirrored;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
        this.numePng = "Acesorii_"+index+"_"+this.color+".png";
    }

    public String getNumePng()
    {
        return numePng;
    }
/*
    public void setNumePng(String numePng)
    {
        this.numePng = numePng;
    }
*/
    public String getColor()
    {   
        return color;
    }

    public void setColor(String color)
    {   
        this.color = color;
        this.numePng = "Acesorii_"+this.index+"_"+color+".png";
    }
    
    public void mirrored()
    {
        this.mirrored=!this.mirrored;
    }
    
    

@Override
public String toString() {
    return super.toString() + "\nAccesoriul este gros = " + this.gros + " cu coloarea = " + this.color
            + " oglindit = " + this.mirrored + ", cu indexul = " + this.index + ", nume fisier .png=" + this.numePng;
}


}
