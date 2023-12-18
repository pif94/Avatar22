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
        //de adaugat obiectele tip file pt fiecare caz
         File file = new File("bluzain.txt");
         File out = new File("bluzaout.txt");
         
         //de creat scanere si printere individuale pt fiecare clasa
         Scanner bin = new Scanner(file);
         PrintWriter bout = new PrintWriter(out);
        int alg;

        do
        {

            System.out.println("1:Test Par+Palarie\n2:Test Fata+Accesori\n3:Test Bluza+Fusta\n4:Test Pantaloni+Pantofi\n");

            alg = scanner.nextInt();
          
            switch (alg)
            {
//start case 1
                case 1:
        Par p1 = new Par(1, "alb",1,350,1000); 
        Par p2 = new Par(2,"albastru", 2,340,1050); 
        //Par p3 = new Par(p2); 
        Par p3 = new Par(3, "mov", 3,366,950);
        Palarie pa1 = new Palarie(1, "mov", 1, 300,1000); 
        Palarie pa2 = new Palarie(2, "negru ", 2,250,900); 
      //  Palarie pa3 = new Palarie(pa2); 
        Palarie pa3 = new Palarie(3,"maro", 3,266,850);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(pa1);
        System.out.println(pa2);
        System.out.println(pa3);
        ArrayList<Par> parListT = new ArrayList<>();
                    Par par1=new Par();
                    Par par2= new Par(1, "alb", 1,350,1000);
                    Par par3= new Par(2, "albastru", 2,333,1050);
                    Par par4= new Par(3,"galben", 3,365,1100); 
                    Par par5= new Par(4,"maro", 4,321,980);
                    Par par6= new Par(5, "mov", 5,335,480); 
                    Par par7= new Par(6,"negru", 6,400,1000); 
                    Par par8= new Par(7,"portocaliu", 7,370,130);
                    Par par9= new Par(8,"rosu", 8,300,1051);
                    Par par10= new Par(par9);

                     parListT.add(par1);
                      parListT.add(par2);
                       parListT.add(par3);
                        parListT.add(par4);
                         parListT.add(par5);
                          parListT.add(par6);
                           parListT.add(par7);
                            parListT.add(par8);
                             parListT.add(par9);
                              parListT.add(par10);
                    for (Par par : parListT)
                    {
                        System.out.println(par + "\n");
                    }
   
        ArrayList<Palarie> palarieListT = new ArrayList<>();
                    Palarie palarie1=new Palarie();
                    Palarie palarie2= new Palarie(1,  "alb", 1, 400, 1000);
                    Palarie palarie3= new Palarie(2,  "albastru", 2, 387, 950); 
                    Palarie palarie4= new Palarie(3, "galben", 3, 360, 980); 
                    Palarie palarie5= new Palarie(4,  "maro", 4, 350, 1000); 
                    Palarie palarie6= new Palarie(5,  "mov", 5, 370, 990); 
                    Palarie palarie7= new Palarie(6,  "negru", 6, 380, 990); 
                    Palarie palarie8= new Palarie(7,  "portocaliu", 7, 380, 980 );
                    Palarie palarie9= new Palarie(8, "rosu", 8, 410, 1010); 
                    Palarie palarie10= new Palarie(palarie9);
                    
                     palarieListT.add(palarie1);
                      palarieListT.add(palarie2);
                       palarieListT.add(palarie3);
                        palarieListT.add(palarie4);
                         palarieListT.add(palarie5);
                          palarieListT.add(palarie6);
                           palarieListT.add(palarie7);
                            palarieListT.add(palarie8);
                             palarieListT.add(palarie9);
                              palarieListT.add(palarie10);
                    for (Palarie palarie : palarieListT)
                    {
                        System.out.println(palarie + "\n");
                    }
                    
      // Adaugare filtru Daria
                    String colorPar;
                    int layerPar;
                System.out.println("Ce culoare sa fie obiectele de tip Par?"); 
                    colorPar = scanner.next(); 
                System.out.println("Pe ce layer sa fie obiectele de tip Par? (1-8)");
                    layerPar = scanner.nextInt();                   
                    for (Par par : parListT) {
                        if (par.getCuloarePar().equals(colorPar) && par.getLayer() == layerPar) {
                            System.out.println(par + "\n");
                        }
                    }



                String colorPalarie;
                int layerPalarie;
            System.out.println("Ce culoare sa fie obiectele de tip Palarie?"); 
                colorPalarie = scanner.next(); 
            System.out.println("Pe ce layer sa fie obiectele de tip Palarie? (1-8)");
                layerPalarie = scanner.nextInt();
            for (Palarie palarie : palarieListT) {
                  if (palarie.getCuloarePalarie().equals(colorPalarie) && palarie.getLayer() == layerPalarie) {
                  System.out.println(palarie + "\n");
                    }
            }


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
                    
                    //fusta
                    ArrayList<Fusta> fustaListT = new ArrayList<>();
                    Fusta fusta1=new Fusta();
                    Fusta fusta2= new Fusta(2, "alb",1,355,1100);
                    Fusta fusta3= new Fusta(3, "mov",1,350,1150);
                    Fusta fusta4= new Fusta(4,"albastru",3,360,1160);
                    Fusta fusta5= new Fusta(5,"roz",1,370,1170);
                    Fusta fusta6= new Fusta(6, "negru",3,380,1180);
                    Fusta fusta7= new Fusta(7,"portocaliu",1,390,1190);
                    Fusta fusta8= new Fusta(8,"rosu",1,400,1200);
                    Fusta fusta9= new Fusta(9,"verde",1,410,1210);
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
        bin.close();
        bout.close();
        }
      catch(Exception e)
        {System.out.println(e);}

    }
}