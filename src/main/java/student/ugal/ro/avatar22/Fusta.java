/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
        this.numePng="Fusta_"+this.index+".png";
        
    }

    
    public Fusta(String color, int index, int layer, int[] culoare, int pozitieX, int pozitieY)
    {
        super(layer, culoare, pozitieX, pozitieY);
        
        this.color = color;
        this.index = index;
        this.numePng="Fusta_"+this.index+"_"+this.color+".png";
    }
    
    public Fusta(Fusta f)
    {
    
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
    }
    
    public String getNumePng()
    {
        return numePng;
    }

    public void setNumePng(String numePng)
    {
        this.numePng = numePng;
    }
    
    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    @Override
public String toString() {
    
    return super.toString() + "\nFusta este de coloarea = " + this.color
            +" cu indexul = " + this.index + ", iar numele fisierlui e " + this.numePng;
}
}
