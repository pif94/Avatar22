package student.ugal.ro.avatar22;

import java.util.Arrays;

public class Avatar {

    private int layer;
    private int[] backgroundColor;// backgroundColor de scos
    private int pozitieX, pozitieY;

    // <editor-fold defaultstate="collapsed" desc="code-fold">
    static final String culori[]={"alb","galben", "mov", "albastru", "roz",
                           "negru", "portocaliu", "rosu", "verde", "maro"};
    
    static final String numeFisierePar[][]={
        {"par_0_alb.png", "par_0_galben.png", "par_0_mov.png", "par_0_albastru.png", "par_0_roz.png", 
         "par_0_negru.png", "par_0_portocaliu.png", "par_0_rosu.png", "par_0_verde.png", "par_0_maro.png"},
        {"par_1_alb.png", "par_1_galben.png", "par_1_mov.png", "par_1_albastru.png", "par_1_roz.png", 
         "par_1_negru.png", "par_1_portocaliu.png", "par_1_rosu.png", "par_1_verde.png", "par_1_maro.png"},
        {"par_2_alb.png", "par_2_galben.png", "par_2_mov.png", "par_2_albastru.png", "par_2_roz.png", 
         "par_2_negru.png", "par_2_portocaliu.png", "par_2_rosu.png", "par_2_verde.png", "par_2_maro.png"}
    };

    static final String numeFisiereFata[][]={
        {"fata_0_alb.png", "fata_0_galben.png", "fata_0_mov.png", "fata_0_albastru.png", "fata_0_roz.png", 
         "fata_0_negru.png", "fata_0_portocaliu.png", "fata_0_rosu.png", "fata_0_verde.png", "fata_0_maro.png"},
        {"fata_1_alb.png", "fata_1_galben.png", "fata_1_mov.png", "fata_1_albastru.png", "fata_1_roz.png", 
         "fata_1_negru.png", "fata_1_portocaliu.png", "fata_1_rosu.png", "fata_1_verde.png", "fata_1_maro.png"},
        {"fata_2_alb.png", "fata_2_galben.png", "fata_2_mov.png", "fata_2_albastru.png", "fata_2_roz.png", 
         "fata_2_negru.png", "fata_2_portocaliu.png", "fata_2_rosu.png", "fata_2_verde.png", "fata_2_maro.png"}
    };

    static final String numeFisiereBluza[][]={
        {"bluza_0_alb.png", "bluza_0_galben.png", "bluza_0_mov.png", "bluza_0_albastru.png", "bluza_0_roz.png", 
         "bluza_0_negru.png", "bluza_0_portocaliu.png", "bluza_0_rosu.png", "bluza_0_verde.png", "bluza_0_maro.png"},
        {"bluza_1_alb.png", "bluza_1_galben.png", "bluza_1_mov.png", "bluza_1_albastru.png", "bluza_1_roz.png", 
         "bluza_1_negru.png", "bluza_1_portocaliu.png", "bluza_1_rosu.png", "bluza_1_verde.png", "bluza_1_maro.png"},
        {"bluza_2_alb.png", "bluza_2_galben.png", "bluza_2_mov.png", "bluza_2_albastru.png", "bluza_2_roz.png", 
         "bluza_2_negru.png", "bluza_2_portocaliu.png", "bluza_2_rosu.png", "bluza_2_verde.png", "bluza_2_maro.png"}
    };

    static final String numeFisiereFusta[][]={
        {"fusta_0_alb.png", "fusta_0_galben.png", "fusta_0_mov.png", "fusta_0_albastru.png", "fusta_0_roz.png", 
         "fusta_0_negru.png", "fusta_0_portocaliu.png", "fusta_0_rosu.png", "fusta_0_verde.png", "fusta_0_maro.png"},
        {"fusta_1_alb.png", "fusta_1_galben.png", "fusta_1_mov.png", "fusta_1_albastru.png", "fusta_1_roz.png", 
         "fusta_1_negru.png", "fusta_1_portocaliu.png", "fusta_1_rosu.png", "fusta_1_verde.png", "fusta_1_maro.png"},
        {"fusta_2_alb.png", "fusta_2_galben.png", "fusta_2_mov.png", "fusta_2_albastru.png", "fusta_2_roz.png", 
         "fusta_2_negru.png", "fusta_2_portocaliu.png", "fusta_2_rosu.png", "fusta_2_verde.png", "fusta_2_maro.png"}
    };

    static final String numeFisierePantaloni[][]={
        {"pantaloni_0_alb.png", "pantaloni_0_galben.png", "pantaloni_0_mov.png", "pantaloni_0_albastru.png", "pantaloni_0_roz.png", 
         "pantaloni_0_negru.png", "pantaloni_0_portocaliu.png", "pantaloni_0_rosu.png", "pantaloni_0_verde.png", "pantaloni_0_maro.png"},
        {"pantaloni_1_alb.png", "pantaloni_1_galben.png", "pantaloni_1_mov.png", "pantaloni_1_albastru.png", "pantaloni_1_roz.png", 
         "pantaloni_1_negru.png", "pantaloni_1_portocaliu.png", "pantaloni_1_rosu.png", "pantaloni_1_verde.png", "pantaloni_1_maro.png"},
        {"pantaloni_2_alb.png", "pantaloni_2_galben.png", "pantaloni_2_mov.png", "pantaloni_2_albastru.png", "pantaloni_2_roz.png", 
         "pantaloni_2_negru.png", "pantaloni_2_portocaliu.png", "pantaloni_2_rosu.png", "pantaloni_2_verde.png", "pantaloni_2_maro.png"}
    };
    
    static final String numeFisierePantofi[][]={
        {"pantofi_0_alb.png", "pantofi_0_galben.png", "pantofi_0_mov.png", "pantofi_0_albastru.png", "pantofi_0_roz.png", 
         "pantofi_0_negru.png", "pantofi_0_portocaliu.png", "pantofi_0_rosu.png", "pantofi_0_verde.png", "pantofi_0_maro.png"},
        {"pantofi_1_alb.png", "pantofi_1_galben.png", "pantofi_1_mov.png", "pantofi_1_albastru.png", "pantofi_1_roz.png", 
         "pantofi_1_negru.png", "pantofi_1_portocaliu.png", "pantofi_1_rosu.png", "pantofi_1_verde.png", "pantofi_1_maro.png"},
        {"pantofi_2_alb.png", "pantofi_2_galben.png", "pantofi_2_mov.png", "pantofi_2_albastru.png", "pantofi_2_roz.png", 
         "pantofi_2_negru.png", "pantofi_2_portocaliu.png", "pantofi_2_rosu.png", "pantofi_2_verde.png", "pantofi_2_maro.png"}
    };

    static final String numeFisierePalarie[][]={
        {"palarie_0_alb.png", "palarie_0_galben.png", "palarie_0_mov.png", "palarie_0_albastru.png", "palarie_0_roz.png", 
         "palarie_0_negru.png", "palarie_0_portocaliu.png", "palarie_0_rosu.png", "palarie_0_verde.png", "palarie_0_maro.png"},
        {"palarie_1_alb.png", "palarie_1_galben.png", "palarie_1_mov.png", "palarie_1_albastru.png", "palarie_1_roz.png", 
         "palarie_1_negru.png", "palarie_1_portocaliu.png", "palarie_1_rosu.png", "palarie_1_verde.png", "palarie_1_maro.png"},
        {"palarie_2_alb.png", "palarie_2_galben.png", "palarie_2_mov.png", "palarie_2_albastru.png", "palarie_2_roz.png", 
         "palarie_2_negru.png", "palarie_2_portocaliu.png", "palarie_2_rosu.png", "palarie_2_verde.png", "palarie_2_maro.png"}
    };
    
    static final String numeFisiereAccessorii[][]={
        {"accesorii_0_alb.png", "accesorii_0_galben.png", "accesorii_0_mov.png", "accesorii_0_albastru.png", "accesorii_0_roz.png", 
         "accesorii_0_negru.png", "accesorii_0_portocaliu.png", "accesorii_0_rosu.png", "accesorii_0_verde.png", "accesorii_0_maro.png"},
        {"accesorii_1_alb.png", "accesorii_1_galben.png", "accesorii_1_mov.png", "accesorii_1_albastru.png", "accesorii_1_roz.png", 
         "accesorii_1_negru.png", "accesorii_1_portocaliu.png", "accesorii_1_rosu.png", "accesorii_1_verde.png", "accesorii_1_maro.png"},
        {"accesorii_2_alb.png", "accesorii_2_galben.png", "accesorii_2_mov.png", "accesorii_2_albastru.png", "accesorii_2_roz.png", 
         "accesorii_2_negru.png", "accesorii_2_portocaliu.png", "accesorii_2_rosu.png", "accesorii_2_verde.png", "accesorii_2_maro.png"}
    };
    // </editor-fold>
    
    public Avatar()
    {
        this.layer = 0;
        this.backgroundColor = new int[]{255, 255, 255}; //long in hexa ??
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
    
    

    public Avatar(int layer, int[] backgroundColor, int pozitieX, int pozitieY)
    {
        this.layer = layer;
        this.backgroundColor = backgroundColor;
        this.pozitieX = pozitieX;
        this.pozitieY = pozitieY;
    }



    public int getLayer()
    {
        return layer;
    }

    public void setLayer(int layer)
    {
        this.layer = layer;
    }

    public int[] getBackgroundColor()
    {
        return backgroundColor;
    }

    public void setBackgroundColor(int[] backgroundColor)
    {
        this.backgroundColor = backgroundColor;
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
    return "Layer " + this.layer + " ,culoare de fundal " + Arrays.toString(this.backgroundColor)
            + " aflat la pozitiile [" + this.pozitieX + "," + this.pozitieY + "]";
}
}
