package student.ugal.ro.avatar22;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class AvatarTest {

    public static void main(String[] args)
    {
        try{
        Scanner scanner = new Scanner(System.in); //de comentat dupa modificari
       
        int alg;

        do
        {

            System.out.println("1:Test Par+Palarie\n2:Test Fata+Accesori\n3:Test Bluza+Fusta\n4:Test Pantaloni+Pantofi\n");

            alg = scanner.nextInt();
          
            switch (alg)
            {
//start case 1
                case 1:

            

    // Final case 1                
                    break;
                case 2:

                    
                    
                    String def="";
                    int ind=0;
                    
                    // constr. implict
                    Fata fata0 = new Fata();
//public Fata( int index, String eyeColor, int layer,  int pozitieX, int pozitieY)
                    Fata fata1 = new Fata(0, "Rosii", 2, 350, 950);
                    Fata fata2 = new Fata(1, "Albastrii", 1, 350, 950);
                    Fata fata3 = new Fata(1, "Alb", 3, 350, 950);
                    Fata fata4 = new Fata(2, "Verzi", 4, 350, 950);
                    Fata fata5 = new Fata(3, "Galbeni", 7, 350, 950);
                    Fata fata6 = new Fata(5, "Mov", 11, 350, 950);
                    Fata fata7 = new Fata(8, "Maronii", 18, 350, 950);

                    //constr. copiere
                    Fata fata8 = new Fata(fata0);
                    Fata fata9 = new Fata(fata1);

                    ArrayList<Fata> fataListF1 = new ArrayList<>();

                    fataListF1.add(fata0);
                    fataListF1.add(fata1);
                    fataListF1.add(fata2);
                    fataListF1.add(fata3);
                    fataListF1.add(fata4);
                    fataListF1.add(fata5);
                    fataListF1.add(fata6);
                    fataListF1.add(fata7);
                    fataListF1.add(fata8);
                    fataListF1.add(fata9);

                    
                    System.out.println("Introduceti culoare pe care doriti sa o gasiti");
                    scanner.nextLine();
                    def = scanner.nextLine();

                    
                    System.out.println("Introduceti indexul cautat");
                    ind = scanner.nextInt();

                    for (Fata fata : fataListF1)
                    {
                        if (def.equalsIgnoreCase(fata.getEyeColor()) || ind == fata.getIndex())
                        {
                            System.out.println(fata.toString() + "\n");
                        }
                    }

//                 /*   for (Fata fata : fataListF1)
//                    {
//                        System.out.println(fata + "\n");
//                    }*/
                    
                    boolean mirroredBool;
                    int pozXScn;
                    //constructor implicit
                    Accesori accesori0 = new Accesori();
                    //public Accesori(boolean gros, boolean mirrored, int index, String color, int layer,  int pozitieX, int pozitieY)
                    Accesori accesori1 = new Accesori(false, false, 3, "RosuRubiniu", 1, 305, 240);
                    Accesori accesori2 = new Accesori(false, true, 1, "AlbastruRegal", 2, 320, 560);
                    Accesori accesori3 = new Accesori(true, false, 4, "VerdeSmarald", 4, 335, 920);
                    Accesori accesori4 = new Accesori(true, true, 5, "GalbenAuriu", 7, 350, 290);
                    Accesori accesori5 = new Accesori(false, false, 9, "PortocaliuCoral", 11, 365, 710);
                    Accesori accesori6 = new Accesori(true, false, 2, "VioletAmetist", 16, 380, 1160);
                    Accesori accesori7 = new Accesori(false, false, 6, "GriPerlat", 22, 395, 440);
                    //constructor copiere
                    Accesori accesori8 = new Accesori(accesori1);
                    Accesori accesori9 = new Accesori(accesori5);

                    ArrayList<Accesori> accesoriList2 = new ArrayList<>();

                    accesoriList2.add(accesori0);
                    accesoriList2.add(accesori1);
                    accesoriList2.add(accesori2);
                    accesoriList2.add(accesori3);
                    accesoriList2.add(accesori4);
                    accesoriList2.add(accesori5);
                    accesoriList2.add(accesori6);
                    accesoriList2.add(accesori7);
                    accesoriList2.add(accesori8);
                    accesoriList2.add(accesori9);

                   
                    System.out.println("Accesoriul este in oglinda? (true/false)");
                    mirroredBool=scanner.nextBoolean();
                    
                    
                    
                    System.out.println("Introduceti limita inferioara pentru pozitia orizontala");
                    pozXScn=scanner.nextInt();

               
                    for (Accesori accesori : accesoriList2)
                    {
                        if(accesori.isMirrored()==mirroredBool&&accesori.getPozitieX()>=pozXScn)
                        {
                            System.out.println(accesori.toString() + "\n");
                        }
                    }
                    
                    
//                    for (Accesori accesori : accesoriList2)
//                    {
//                        System.out.println(accesori + "\n");
//                    }

                    break;

                    
                case 3:
                     //de adaugat obiectele tip file pt fiecare caz
         File bluzafile = new File("bluzain.txt");
         File bluzaout = new File("bluzaout.txt");
         
         //de creat scanere si printere individuale pt fiecare clasa
         Scanner bin = new Scanner(bluzafile);
         PrintWriter bout = new PrintWriter(bluzaout);
                    
                    //"alb","galben", "mov", "albastru", "roz",
                          // "negru", "portocaliu", "rosu", "verde", "maro"
                    ArrayList<Bluza> bluzaListT = new ArrayList<>();
                    Bluza bluza1=new Bluza();
                    boolean bluzaCold;
                    int bluzaIndex;
                    String bluzaCuloare;
                    int bluzaLayer;
                    int bluzaX, bluzaY;
                    
                    
                    //de copiat
                    bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza2= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    // de repetat
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza3= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza4= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza5= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza6= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza7= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza8= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);
                    
                     bluzaCold=bin.nextBoolean(); bluzaIndex=bin.nextInt();
                    bluzaCuloare=bin.next(); bluzaLayer=bin.nextInt();
                    bluzaX=bin.nextInt(); bluzaY=bin.nextInt();
                    
                    Bluza bluza9= new Bluza(bluzaCold,bluzaIndex, bluzaCuloare,bluzaLayer,bluzaX,bluzaY);

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
                              bluzaListT.add(bluza10);
                    for (Bluza bluza : bluzaListT)
                    {
                        bout.println(bluza + "\n");
                    }
                    
                    bin.close();
                    bout.close();
                    
                    //fusta
                    File fustafile = new File("fustain.txt");
                     File fustaout = new File("fustaout.txt");
         
                    //de creat scanere si printere individuale pt fiecare clasa
                     Scanner fustain = new Scanner(fustafile);
                     PrintWriter fout = new PrintWriter(fustaout);
                       String fustaCuloare;
                       int fustaIndex;
                       int fustaLayer, fustaX, fustaY;
                    
                    ArrayList<Fusta> fustaListT = new ArrayList<>();
                    Fusta fusta1=new Fusta();
                    //de repetat
                    fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta2= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                   
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta3= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta4= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta5= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta6= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta7= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta8= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
                     fustaIndex=fustain.nextInt();
                    fustaCuloare=fustain.next(); fustaLayer=fustain.nextInt();
                    fustaX=fustain.nextInt(); fustaY=fustain.nextInt();
                    Fusta fusta9= new Fusta(fustaIndex, fustaCuloare,fustaLayer,fustaX,fustaY);
                    
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
                        fout.println(fusta + "\n");
                    }
                    
                    fustain.close();
                    fout.close();
                    
                    //Pentru filtru bluza
                    int t; int layerBluza;
                    System.out.println("Introduceti 1 pt colectia de iarna sau 2 pt cea de vara.");
                    t=scanner.nextInt();
                    System.out.println("Pe ce layer sa fie obiectul? (1-6)");
                    layerBluza=scanner.nextInt();
                    boolean filtru;
                    
                    if (t == 1 ) {filtru = true;}
                    else  {filtru = false;}

                    for (Bluza bluza : bluzaListT){

                        if (bluza.isGros() == filtru && bluza.getLayer()==layerBluza)
                     System.out.println(bluza + "\n");

                        }
                     //Pentru filtru fusta
                    String culoareFiltru; int layerFusta;
                    System.out.println("Ce culoare sa fie fusta?");
                    culoareFiltru=scanner.next();
                    System.out.println("Pe ce layer sa fie obiectul? (1-3)");
                    layerFusta=scanner.nextInt(); 
                     for (Fusta fusta : fustaListT){

                        if (fusta.getColor().equals(culoareFiltru) && fusta.getLayer()==layerFusta)
                     System.out.println(fusta + "\n");
                        }
                             
                    break;
                case 4:
        ArrayList<Pantofi> pantofiListT = new ArrayList<>();
                    Pantofi pantofi1=new Pantofi();
                    Pantofi pantofi2= new Pantofi(false, 1,  "alb", 1, 350, 1000);
                    Pantofi pantofi3= new Pantofi(false, 2,  "albastru", 2, 380, 950);
                    Pantofi pantofi4= new Pantofi(true, 3, "galben", 3, 360, 985); 
                    Pantofi pantofi5= new Pantofi(false, 4,  "maro", 4, 370, 1000);
                    Pantofi pantofi6= new Pantofi(true, 5,  "mov", 5, 370, 990); 
                    Pantofi pantofi7= new Pantofi(false, 6,  "negru", 6, 380, 990); 
                    Pantofi pantofi8= new Pantofi(true, 7,  "portocaliu", 7, 380, 980);
                    Pantofi pantofi9= new Pantofi(false, 8, "rosu", 8, 400, 910);
                    Pantofi pantofi10= new Pantofi(pantofi9);

                     pantofiListT.add(pantofi1);
                      pantofiListT.add(pantofi2);
                       pantofiListT.add(pantofi3);
                        pantofiListT.add(pantofi4);
                         pantofiListT.add(pantofi5);
                          pantofiListT.add(pantofi6);
                           pantofiListT.add(pantofi7);
                            pantofiListT.add(pantofi8);
                             pantofiListT.add(pantofi9);
                              pantofiListT.add(pantofi10);
                    for (Pantofi pantofi : pantofiListT)
                    {
                        System.out.println(pantofi + "\n");
                    }
        ArrayList<Pantaloni> pantaloniListT = new ArrayList<>();
                    Pantaloni pantaloni1=new Pantaloni();
                    Pantaloni pantaloni2= new Pantaloni(true, 1,  "alb", 1, 350, 1200);
                    Pantaloni pantaloni3= new Pantaloni(false, 2,  "albastru", 2, 370, 1250);
                    Pantaloni pantaloni4= new Pantaloni(false, 3, "galben", 3, 360, 1150); 
                    Pantaloni pantaloni5= new Pantaloni(true, 4,  "maro", 4, 360, 1200);
                    Pantaloni pantaloni6= new Pantaloni(false, 5,  "mov", 5, 370, 1300); 
                    Pantaloni pantaloni7= new Pantaloni(false, 6,  "negru", 6, 370, 1100); 
                    Pantaloni pantaloni8= new Pantaloni(false, 7,  "portocaliu", 7, 380, 1280);
                    Pantaloni pantaloni9= new Pantaloni(false, 8, "rosu", 8, 350, 1200);
                    Pantaloni pantaloni10= new Pantaloni(pantaloni9);

                     pantaloniListT.add(pantaloni1);
                      pantaloniListT.add(pantaloni2);
                       pantaloniListT.add(pantaloni3);
                        pantaloniListT.add(pantaloni4);
                         pantaloniListT.add(pantaloni5);
                          pantaloniListT.add(pantaloni6);
                           pantaloniListT.add(pantaloni7);
                            pantaloniListT.add(pantaloni8);
                             pantaloniListT.add(pantaloni9);
                              pantaloniListT.add(pantaloni10);
                    for (Pantaloni pantaloni : pantaloniListT)
                    {
                        System.out.println(pantaloni + "\n");
                    }
                    //pt filtru pantofi
                    int t1; int layerPantofi;
                    System.out.println("Introduceti 1 pt colectia de iarna sau 2 pt cea de vara.");
                    t1=scanner.nextInt();
                    System.out.println("Pe ce layer sa fie obiectul? (1-6)");
                    layerPantofi=scanner.nextInt();
                    boolean filtru1;
                    
                    if (t1 == 1 ) {filtru1 = true;}
                    else  {filtru1 = false;}

                    for (Pantofi pantofi : pantofiListT){
                        if (pantofi.isGros() == filtru1 && pantofi.getLayer()==layerPantofi)
                        System.out.println(pantofi + "\n");
                    }
                    //pt filtru pantaloni
                    int t2; int layerPantaloni;
                    System.out.println("Introduceti 1 pt colectia de iarna sau 2 pt cea de vara.");
                    t2=scanner.nextInt();
                    System.out.println("Pe ce layer sa fie obiectul? (1-6)");
                    layerPantaloni=scanner.nextInt();
                    boolean filtru2;
                    
                    if (t2 == 1 ) {filtru2 = true;}
                    else  {filtru2 = false;}

                    for (Pantaloni pantaloni : pantaloniListT){
                        if (pantaloni.isDres() == filtru2 && pantaloni.getLayer()==layerPantaloni)
                        System.out.println(pantaloni + "\n");
                    }
            break;
        
    }
        }while (alg!=0);
        scanner.close();

        }
      catch(Exception e)
        {System.out.println(e);}

    }
}