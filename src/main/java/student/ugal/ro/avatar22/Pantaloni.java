package student.ugal.ro.avatar22;

public class Pantaloni extends Avatar {
    boolean dres;
    private String color;
    private int index;
    private String numePng;
    

    public Pantaloni() {
        super();  
        this.dres=false;
        this.color="";
        this.index=0;
        this.numePng="";
    }

    
    public Pantaloni(boolean dres,int index, String color, int layer, int pozitieX, int pozitieY)
    {
        super(layer, pozitieX, pozitieY);  
        this.dres=dres;
        this.color = color;
        this.index = index;
        this.numePng="Pantaloni_"+this.index+"_"+this.color+".png";
    }
    
    public Pantaloni(Pantaloni pt)
    {
        super(pt);
        this.dres=pt.dres;
        this.color=pt.color;
        this.index=pt.index;
        this.numePng=pt.numePng;
    }
   
    
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
        this.numePng="Pantaloni_"+this.index+"_"+this.color+".png";
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
        this.numePng="Pantaloni_"+this.index+"_"+this.color+".png";
    }
    
    @Override
public String toString() {
    
    if(this.dres){
    return super.toString() + "\nDresul  "+ " de coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
    else {
    return super.toString() + "\nPantalonii sunt de coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;}
}
}  

