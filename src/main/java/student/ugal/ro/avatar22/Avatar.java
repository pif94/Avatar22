package student.ugal.ro.avatar22;

public class Avatar {

    private int layer;
    private int pozitieX, pozitieY;

   
    
    public Avatar()
    {
        this.layer = 0;
        this.pozitieX = 0;
        this.pozitieY = 0;
    }
    
    //constructor fara mentionarea culorii de fundal
    public Avatar(int layer, int pozitieX, int pozitieY)
    {
        this.layer = layer;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
    }
    
    public Avatar (Avatar a)
    {
        this.layer = a.layer;
        this.pozitieX = a.pozitieX;
        this.pozitieY = a.pozitieY;
    }

    public int getLayer()
    {
        return layer;
    }

    public void setLayer(int layer)
    {
        this.layer = layer;
    }

    public int getPozitieX()
    {
        return pozitieX;
    }

    public void setPozitieX(int pozitieX)
    {
        this.pozitieX = pozitieX;
    }

    public int getPozitieY()
    {
        return pozitieY;
    }

    public void setPozitieY(int pozitieY)
    {
        this.pozitieY = pozitieY;
    }

@Override
public String toString() {
    return "Obiectul se afla pe Layer " + this.layer + " aflat la pozitiile [" + this.pozitieX + "," + this.pozitieY + "]";
}
}
