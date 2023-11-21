package student.ugal.ro.avatar22;

/**
 *
 * @author Ruby
 */
public class Bluza extends Avatar{
    private boolean gros; //0 pt bluze de primavara vara/ 1 pt toamana/iarna
    private String color; 
    private int index;
    private String numePng;
  //  final int nrModele=3; //de moficat cand se adauga mai multe bluze

    public Bluza() {
        super();
        this.gros=false;
        this.color="";
        this.index=0;
        this.numePng="Bluza_"+this.index+".png";
        
    }

    
    public Bluza(boolean gros,  int index, String color, int layer, int pozitieX, int pozitieY)
    {
        super(layer, pozitieX, pozitieY);
        this.gros = gros;
        this.color = color;
        this.index = index;
        this.numePng="Bluza_"+this.index+"_"+this.color+".png";
    }
    
    public Bluza (Bluza b)
    {super(b);
    this.gros=b.gros;
        this.color=b.color;
        this.index=b.index;
        this.numePng=b.numePng;
    }
    
 
     public boolean isGros()
    {
        return gros;
    }

    public void setGros(boolean gros)
    {
        this.gros = gros;
    }
    
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
        this.numePng="Bluza_"+index+"_"+this.color+".png";
    }
    
    public String getNumePng()
    {
        return numePng;
    }

  /*  public void setNumePng(String numePng)
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
        this.numePng="Bluza_"+this.index+"_"+color+".png";
    }
    
    @Override
public String toString() {
    if(gros){
    return super.toString() + "\nBluza este din colectia Toamna/Iarna"+ " cu coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
    else {
    return super.toString() + "\nBluza este din colectia Primavara.Vara"+ " cu coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
}
}
