package student.ugal.ro.avatar22;

/**
 *
 * @author Ruby
 */
public class Fusta extends Avatar{
    
    private String color;
    private int index;
    private String numePng;
    

    public Fusta() {
        super();       
        this.color="";
        this.index=0;
        this.numePng="";
        
    }

    
    public Fusta(int index, String color, int layer, int pozitieX, int pozitieY)
    {
        super(layer, pozitieX, pozitieY);        
        this.color = color;
        this.index = index;
        this.numePng="fusta_"+this.index+"_"+this.color+".png";
    }
    
    public Fusta(Fusta f)
    {
        super(f);
        this.color=f.color;
        this.index=f.index;
        this.numePng=f.numePng;
    }
   
    
    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
        this.numePng="Fusta_"+this.index+"_"+this.color+".png";
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
        this.numePng="Fusta_"+this.index+"_"+this.color+".png";
    }
    
    @Override
public String toString() {
    
    return super.toString() + "\nFusta este de coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;
}
}
