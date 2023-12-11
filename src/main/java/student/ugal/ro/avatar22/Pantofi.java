package student.ugal.ro.avatar22;

public class Pantofi extends Avatar {
    private boolean cold;
    private String color;
    private int index;
    private String numePng;
    

    public Pantofi() {
        super();  
        this.cold=false;
        this.color="";
        this.index=0;
        this.numePng="";
    }

    
    public Pantofi(boolean cold,int index, String color, int layer, int pozitieX, int pozitieY)
    {
        super(layer, pozitieX, pozitieY);  
        this.cold=cold;
        this.color = color;
        this.index = index;
        this.numePng="Pantofi_"+this.index+"_"+this.color+".png";
    }
    
    public Pantofi(Pantofi pf)
    {
        super(pf);
        this.cold=pf.cold;
        this.color=pf.color;
        this.index=pf.index;
        this.numePng=pf.numePng;
    }
    
    public boolean isGros()
    {
        return cold;
    }
   
    
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
        this.numePng="Pantofi_"+this.index+"_"+this.color+".png";
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
        this.numePng="Pantofi_"+this.index+"_"+this.color+".png";
    }
    
    @Override
public String toString() {
    
    if(this.cold){
    return super.toString() + "\nPantofii sunt din colectia Toamna/Iarna"+ " cu coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
    else {
    return super.toString() + "\nPantofii sunt din colectia Primavara.Vara"+ " cu coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
}
}
    

