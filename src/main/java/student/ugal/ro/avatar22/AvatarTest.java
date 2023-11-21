package student.ugal.ro.avatar22;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import static student.ugal.ro.avatar22.Avatar.culori;

public class AvatarTest {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int alg;

        do
        {

            System.out.println("1:Test Par+Palarie\n2:Test Fata+Accesori\n3:Test Bluza+Fusta\n4:Test Pantaloni+Pantofi\n");

            alg = scanner.nextInt();

            switch (alg)
            {
//start case 1
                case 1:
                    Par p1 = new Par(2, 0, 0, " "); 
        Par p2 = new Par(2, 0, 0,  " "); 
        Par p3 = new Par(p2); 

       
        Palarie pa1 = new Palarie(3, 0, 0, " "); 
        Palarie pa2 = new Palarie(3, 0, 0, " "); 
        Palarie pa3 = new Palarie(pa2); 

        
       
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pa1);
        System.out.println(pa2);
        System.out.println(pa3);

        
       /*
p1.alegePar("par_alb.png");
        p2.alegePar("par_albastru.png");
        p3.alegePar("par_negru.png");
        pa1.alegePalarie("palarie_alb.png");
        pa2.alegePalarie("palarie_albastru.png");
        pa3.alegePalarie("palarie_galben.png");
        */
       
        //  vector de Par
        Vector<Par> vectorPar = new Vector<Par>();
        //  10 instante 
        vectorPar.add(new Par(2, 0, 0, " "));
        vectorPar.add(new Par(1, 0,  0, "alb"));
        vectorPar.add(new Par(2, 0, 0, "albastru"));
        vectorPar.add(new Par(3, 0, 0, "galben"));
        vectorPar.add(new Par(4, 0, 0, "maro"));
        vectorPar.add(new Par(5, 0, 0, "mov"));
        vectorPar.add(new Par(6, 0, 0, "negru"));
        vectorPar.add(new Par(7, 0, 0, "portocaliu"));
        vectorPar.add(new Par(8, 0, 0, "rosu"));
        vectorPar.add(new Par(9, 0,0, "roz"));

        //  un vector de Palarie
        Vector<Palarie> vectorPalarie = new Vector<Palarie>();
        //  10 instante 
        vectorPalarie.add(new Palarie(3, 0,0, " "));
        vectorPalarie.add(new Palarie(1, 0, 00, "alb"));
        vectorPalarie.add(new Palarie(2, 0, 0, "albastru"));
        vectorPalarie.add(new Palarie(3, 0, 0, "galben"));
        vectorPalarie.add(new Palarie(4, 0, 0, "maro"));
        vectorPalarie.add(new Palarie(5, 0, 0, "mov"));
        vectorPalarie.add(new Palarie(6, 0, 0, "negru"));
        vectorPalarie.add(new Palarie(7, 0, 0, "portocaliu"));
        vectorPalarie.add(new Palarie(8, 0, 0, "rosu"));
        vectorPalarie.add(new Palarie(9, 0, 0, "roz"));
        // se afiseaza instantele pt fiecare vector pt par si palarie
        
        System.out.println("Vectorul de Par:");
        for (Par p : vectorPar) { 
            System.out.println(p);         }
        System.out.println("Vectorul de Palarie:");
        for (Palarie pa : vectorPalarie) { 
            System.out.println(pa); 
        }
    
    // Final case 1                
                    break;
                case 2:

                    // constr. implict
                    Fata fata1 = new Fata();

                    //Fata(boolean wink, String eyeColor, int index, String namePng)
                    Fata fata2 = new Fata(true, "Albastru", 1, "fata_1.png");
                    Fata fata3 = new Fata(false, "Verde", 2, "fata_2.png");
                    Fata fata4 = new Fata(true, "Rosu", 3, "fata_3.png");

                    // Fata(String eyeColor, int index, String namePng, int layer, int[] backgroundColor, int pozitieX, int pozitieY)
                    Fata fata5 = new Fata("Galben", 4, "fata_4.png", 2, new int[]
                    {
                        180, 160, 20
                    }, 500, 600);
                    Fata fata6 = new Fata("Roz", 5, "fata_5.png", 3, new int[]
                    {
                        40, 80, 170
                    }, 500, 600);
                    Fata fata7 = new Fata("Negru", 6, "fata_6.png", 2, new int[]
                    {
                        120, 150, 200
                    }, 500, 600);

                    //constr. copiere
                    Fata fata8 = new Fata(fata1);
                    Fata fata9 = new Fata(fata2);
                    Fata fata10 = new Fata(fata5);

                    ArrayList<Fata> fataListT = new ArrayList<>();

                    fataListT.add(fata1);
                    fataListT.add(fata2);
                    fataListT.add(fata3);
                    fataListT.add(fata4);
                    fataListT.add(fata5);
                    fataListT.add(fata6);
                    fataListT.add(fata7);
                    fataListT.add(fata8);
                    fataListT.add(fata9);
                    fataListT.add(fata10);

                    for (Fata fata : fataListT)
                    {
                        System.out.println(fata + "\n");
                    }

                    Accesori accesori1 = new Accesori();
                    //(String color, boolean mirrored, int index, String numePng)
                    Accesori accesori2 = new Accesori("Alb", false, 1, "accesori_1.png");
                    Accesori accesori3 = new Accesori("Negru", true, 2, "accesori_2.png");
                    Accesori accesori4 = new Accesori("Rosu", false, 3, "accesori_3.png");
                    //(boolean gros, String color, boolean mirrored, int index, String numePng, int layer, int[] culoare, int pozitieX, int pozitieY)
                    Accesori accesori5 = new Accesori(false, "Galben", true, 4, "accesori_4.png", 2, new int[]
                    {
                        180, 160, 20
                    }, 940, 678);
                    Accesori accesori6 = new Accesori(false, "Roz", false, 5, "accesori_5.png", 3, new int[]
                    {
                        40, 80, 170
                    }, 501, 597);
                    Accesori accesori7 = new Accesori(true, "Albastru", true, 6, "accesori_6.png", 2, new int[]
                    {
                        120, 150, 200
                    }, 564, 553);
                    //copy constructor accesori
                    Accesori accesori8 = new Accesori(accesori1);
                    Accesori accesori9 = new Accesori(accesori2);
                    Accesori accesori10 = new Accesori(accesori5);

                    ArrayList<Accesori> accesoriList2 = new ArrayList<>();

                    accesoriList2.add(accesori1);
                    accesoriList2.add(accesori2);
                    accesoriList2.add(accesori3);
                    accesoriList2.add(accesori4);
                    accesoriList2.add(accesori5);
                    accesoriList2.add(accesori6);
                    accesoriList2.add(accesori7);
                    accesoriList2.add(accesori8);
                    accesoriList2.add(accesori9);
                    accesoriList2.add(accesori10);

                    for (Accesori accesori : accesoriList2)
                    {
                        System.out.println(accesori + "\n");
                    }

                    break;
                case 3:
                    int i;
                    //"alb","galben", "mov", "albastru", "roz",
                          // "negru", "portocaliu", "rosu", "verde", "maro"
                    ArrayList<Bluza> bluzaListT = new ArrayList<>();
                    Bluza bluza1=new Bluza();
                    Bluza bluza2= new Bluza(false, "alb",2,1,new int[]{255,255,255},0,0);
                    Bluza bluza3= new Bluza(false, "mov",3,1,new int[]{255,255,255},0,0);
                    Bluza bluza4= new Bluza(false, "albastru",4,1,new int[]{255,255,255},0,0);
                    Bluza bluza5= new Bluza(false, "roz",5,1,new int[]{255,255,255},0,0);
                    Bluza bluza6= new Bluza(true, "negru",6,1,new int[]{255,255,255},0,0);
                    Bluza bluza7= new Bluza(true, "portocaliu",7,1,new int[]{255,255,255},0,0);
                    Bluza bluza8= new Bluza(true, "rosu",8,1,new int[]{255,255,255},0,0);
                    Bluza bluza9= new Bluza(false, "verde",9,1,new int[]{255,255,255},0,0);
                    Bluza bluza10= new Bluza(bluza9);
                    
                     bluzaListT.add(bluza1);
                      bluzaListT.add(bluza2);
                       bluzaListT.add(bluza3);
                        bluzaListT.add(bluza4);
                         bluzaListT.add(bluza5);
                          bluzaListT.add(bluza6);
                           bluzaListT.add(bluza7);
                            bluzaListT.add(bluza8);
                             bluzaListT.add(bluza9);
                              bluzaListT.add(bluza1);
                    for (Bluza bluza : bluzaListT)
                    {
                        System.out.println(bluza + "\n");
                    }
                    
                    //fusta
                    ArrayList<Fusta> fustaListT = new ArrayList<>();
                    Fusta fusta1=new Fusta();
                    Fusta fusta2= new Fusta( "alb",2,1,new int[]{255,255,255},0,0);
                    Fusta fusta3= new Fusta( "mov",3,1,new int[]{255,255,255},0,0);
                    Fusta fusta4= new Fusta("albastru",4,1,new int[]{255,255,255},0,0);
                    Fusta fusta5= new Fusta("roz",5,1,new int[]{255,255,255},0,0);
                    Fusta fusta6= new Fusta( "negru",6,1,new int[]{255,255,255},0,0);
                    Fusta fusta7= new Fusta("portocaliu",7,1,new int[]{255,255,255},0,0);
                    Fusta fusta8= new Fusta("rosu",8,1,new int[]{255,255,255},0,0);
                    Fusta fusta9= new Fusta("verde",9,1,new int[]{255,255,255},0,0);
                    Fusta fusta10= new Fusta(fusta9);
                    
                     fustaListT.add(fusta1);
                     fustaListT.add(fusta2);
                     fustaListT.add(fusta3);
                     fustaListT.add(fusta4);
                     fustaListT.add(fusta5);
                     fustaListT.add(fusta6);
                     fustaListT.add(fusta7);
                     fustaListT.add(fusta8);
                     fustaListT.add(fusta9);
                     fustaListT.add(fusta10);
                    for (Fusta fusta : fustaListT)
                    {
                        System.out.println(fusta + "\n");
                    }
                             
                    break;
                case 4:

                    //Testare clasa Pantaloni
                    System.out.println("\nTestare clasa Pantaloni\n");
                    Pantaloni p = new Pantaloni();
                    int nrModelePantaloni = p.getNrModele();

                    //Avem un nr. de instante de pantaloni = cu nrModelePantaloni x 10 culori
                    Pantaloni x[][] = new Pantaloni[nrModelePantaloni][10];
                    for (int model = 0; model < nrModelePantaloni; model++)
                    {
                        for (int culoare = 0; culoare < 10; culoare++)
                        {
                            x[model][culoare] = new Pantaloni(model, culoare);
                            System.out.println(x[model][culoare]);
                            /*putem afisa obiectul x[][] direct cu println deoarece a fost
                suprascrisa metoda toString in clasa Pantaloni*/
                        }
                    }

                    //Testare clasa Pantofi
                    System.out.println("\nTestare clasa Pantofi\n");
                    Pantofi q = new Pantofi();
                    int nrModelePantofi = q.getNrModele();

                    //Avem un nr. de instante de pantofi = cu nrModelePantofi x 10 culori
                    Pantofi y[][] = new Pantofi[nrModelePantofi][10];
                    for (int model = 0; model < nrModelePantofi; model++)
                    {
                        for (int culoare = 0; culoare < 10; culoare++)
                        {
                            y[model][culoare] = new Pantofi(model, culoare);
                            System.out.println(y[model][culoare]);
                            /*putem afisa obiectul y[][] direct cu println deoarece a fost
                suprascrisa metoda toString in clasa Pantofi*/
                        }
                    }
            
            break;
        
    }
        }while (alg!=0);
        scanner.close();

    }
}