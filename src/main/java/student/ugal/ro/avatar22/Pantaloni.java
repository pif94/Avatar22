package student.ugal.ro.avatar22;

public class Pantaloni extends Avatar {
    final int nrModele=3; //cate modele de pantaloni avem; nu se modifica!
    int indiceModel; //numarul modelului curent selectat de utilizator
    int indiceCuloare; //numarul culorii curente selectate de utilizator
    
    Pantaloni() { //constructor fara argumente
        this.indiceModel=0;
        this.indiceCuloare=0;
    }
    
    Pantaloni(int indiceModel, int indiceCuloare) { //constructor cu argumente
        this.indiceModel=indiceModel;
        this.indiceCuloare=indiceCuloare;
    }
    
    Pantaloni (Pantaloni p){ //constructor de copiere
        this.indiceModel=p.indiceModel;
        this.indiceCuloare=p.indiceCuloare;
    }
    
    int getNrModele() { 
        /*va intoarce cate modele de pantaloni avem, ca sa stim in fereastra
        grafica de cate ori poate face Next si Back utilizatorul*/
        return nrModele;
    }
    
    int getIndiceModel() {
        /*va intoarce indicele modelului curent de pantalon selectat de 
        utilizator, ca sa stim ce fisier sa alegem pentru afisare*/
        return indiceModel;
    }
    
    int getIndiceCuloare() {
        /*va intoarce indicele culorii curente de pantalon selectate de 
        utilizator, ca sa stim ce fisier sa alegem pentru afisare*/
        return indiceCuloare;
    }
    
    @Override
    public String toString(){
        return "Pantalonul ales are modelul "+indiceModel+
               " si culoarea "+culori[indiceCuloare]+
               " si se gaseste in fisierul "+numeFisierePantaloni[indiceModel][indiceCuloare];
    }
}
