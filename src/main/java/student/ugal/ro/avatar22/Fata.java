package student.ugal.ro.avatar22;

//vn177
public class Fata extends Avatar {

    private boolean blinking;
    private String eyeColor;
    private int index;
    private String namePng;
    private boolean wink;

    public Fata()
    {   super();
        this.blinking = false;
        this.eyeColor = "";
        this.index = 0;
        this.namePng=""; 
        this.wink = false;
    }

   /* public Fata(boolean wink,String eyeColor,int index,String namePng)
    {
        super();
        this.blinking=false;
        this.wink=wink;
        this.eyeColor=eyeColor;
        this.index=index;
        this.namePng=namePng;
    }
    */
    
    public Fata( int index, String eyeColor, int layer,  int pozitieX, int pozitieY)
    {
        super(layer, pozitieX, pozitieY);
        this.blinking = false;
        this.eyeColor = eyeColor;
        this.index = index;
        this.namePng = "Fata_"+this.index+"_"+this.eyeColor+".png";
        this.wink = false;
    }

    public Fata( Fata F)
    {
        super(F);
        this.blinking = F.blinking;
        this.eyeColor = F.eyeColor;
        this.index = F.index;
        this.namePng = F.namePng;
        this.wink = F.wink;
    }
    
    

    public boolean getBlinking()
    {
        return this.blinking;
    }

    public void setBlinking(boolean blinking)
    {
        this.blinking = blinking;
    }

        public String getEyeColor()
    {
        return this.eyeColor;
    }

    public void setEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }

    public int getIndex()
    {
        return this.index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }
    
    //mod subtil de a indica faptul că avatarul este interactiv
    public void blink()
    {
        //System.out.println(blinking);
        if (!getBlinking())
        {
            setBlinking(true);
            // System.out.println(blinking);
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            setBlinking(false);
        } else
        {
            try
            {
                Thread.sleep(500);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            setBlinking(false);
        }
    }

    //pentru alegere daca ochi sunt inchisi sau nu
    public void wink()
    {
        this.wink = !this.wink;
    }

@Override
public String toString() {
    return super.toString() + "\nFata cu ochii de culoare = " + this.eyeColor
            + " ,cu indexul = " + this.index + " cu nume fisier png = " + this.namePng
            + " ochii inchisi = " + this.wink;
}




}
