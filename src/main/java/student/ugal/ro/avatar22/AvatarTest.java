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
    // Final case 1                
                    break;
                case 2:
                    File fataFile = new File("fataIn.txt");
                    File fataOut = new File("fataOut.txt");

                    Scanner fataScnIn = new Scanner(fataFile);
                    PrintWriter fataPW = new PrintWriter(fataOut);

                    ArrayList<Fata> fataList = new ArrayList<>();

                    // constr. implict
                    Fata fata0 = new Fata();

                    int indexFata,
                     layerFata,
                     pozitieXFata,
                     pozitieYFata;
                    String eyeColorFata;

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();
//public Fata( int index, String eyeColor, int layer,  int pozitieX, int pozitieY)
                    Fata fata1 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata2 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata3 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata4 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata5 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata6 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    indexFata = fataScnIn.nextInt();
                    eyeColorFata = fataScnIn.next();
                    layerFata = fataScnIn.nextInt();
                    pozitieXFata = fataScnIn.nextInt();
                    pozitieYFata = fataScnIn.nextInt();

                    Fata fata7 = new Fata(indexFata, eyeColorFata, layerFata, pozitieXFata, pozitieYFata);

                    //constr. copiere
                    Fata fata8 = new Fata(fata0);
                    Fata fata9 = new Fata(fata1);

                    fataList.add(fata0);
                    fataList.add(fata1);
                    fataList.add(fata2);
                    fataList.add(fata3);
                    fataList.add(fata4);
                    fataList.add(fata5);
                    fataList.add(fata6);
                    fataList.add(fata7);
                    fataList.add(fata8);
                    fataList.add(fata9);

                    for (Fata fata : fataList)
                    {
                        fataPW.println(fata + "\n");
                    }

                    fataScnIn.close();
                    fataPW.close();

                    String def = "";
                    int ind = 0;
                    System.out.println("Introduceti culoare pe care doriti sa o gasiti");
                    scanner.nextLine();
                    def = scanner.nextLine();

                    System.out.println("Introduceti indexul cautat");
                    ind = scanner.nextInt();

                    for (Fata fata : fataList)
                    {
                        if (def.equalsIgnoreCase(fata.getEyeColor()) || ind == fata.getIndex())
                        {
                            System.out.println(fata.toString() + "\n");
                        }
                    }

                    ArrayList<Accesori> accesoriList2 = new ArrayList<>();

                    File accesoriiFile = new File("accesoriIn.txt");
                    File accesoriiOut = new File("accesoriOut.txt");

                    Scanner accesoriiScnIn = new Scanner(accesoriiFile);
                    PrintWriter accesoriiPW = new PrintWriter(accesoriiOut);

                    //constructor implicit
                    Accesori accesori0 = new Accesori();
                    //public Accesori(boolean gros, boolean mirrored, int index, String color, int layer,  int pozitieX, int pozitieY)

                    boolean accesoriuGros,
                     accesoriuOglinda;
                    int indexAccesoriu,
                     layerAccesoriu,
                     pozitieXAccesoriu,
                     pozitieYAccesoriu;
                    String culoareAccesoriu;

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori1 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori2 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori3 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori4 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori5 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori6 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    accesoriuGros = accesoriiScnIn.nextBoolean();
                    accesoriuOglinda = accesoriiScnIn.nextBoolean();
                    indexAccesoriu = accesoriiScnIn.nextInt();
                    culoareAccesoriu = accesoriiScnIn.next();
                    layerAccesoriu = accesoriiScnIn.nextInt();
                    pozitieXAccesoriu = accesoriiScnIn.nextInt();
                    pozitieYAccesoriu = accesoriiScnIn.nextInt();

                    Accesori accesori7 = new Accesori(accesoriuGros, accesoriuOglinda, indexAccesoriu, culoareAccesoriu, layerAccesoriu, pozitieXAccesoriu, pozitieYAccesoriu);

                    //constructor copiere
                    Accesori accesori8 = new Accesori(accesori0);
                    Accesori accesori9 = new Accesori(accesori5);

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

                    for (Accesori accesori : accesoriList2)
                    {
                        accesoriiPW.println(accesori + "\n");
                    }

                    accesoriiScnIn.close();
                    accesoriiPW.close();

                    boolean mirroredBool;
                    int pozXScn;
                    System.out.println("Accesoriul este in oglinda? (true/false)");
                    mirroredBool = scanner.nextBoolean();

                    System.out.println("Introduceti limita inferioara pentru pozitia orizontala");
                    pozXScn = scanner.nextInt();

                    for (Accesori accesori : accesoriList2)
                    {
                        if (accesori.isMirrored() == mirroredBool && accesori.getPozitieX() >= pozXScn)
                        {
                            System.out.println(accesori.toString() + "\n");
                        }
                    }

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
           
            break;
        
    }
        }while (alg!=0);
        scanner.close();

        }
      catch(Exception e)
        {System.out.println(e);}

    }
}