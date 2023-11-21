package student.ugal.ro.avatar22;

public class Pantofi extends Avatar {
    final int nrModele=3; //cate modele de pantofi avem; nu se modifica!
    int indiceModel; //numarul modelului curent selectat de utilizator
    int indiceCuloare; //numarul culorii curente selectate de utilizator
    
    Pantofi() { //constructor fara argumente
        this.indiceModel=0;
        this.indiceCuloare=0;
    }
    
    Pantofi(int indiceModel, int indiceCuloare) { //constructor cu argumente
        this.indiceModel=indiceModel;
        this.indiceCuloare=indiceCuloare;
    }
    
    Pantofi (Pantofi p){ //constructor de copiere
        this.indiceModel=p.indiceModel;
        this.indiceCuloare=p.indiceCuloare;
    }
    
    int getNrModele() {
        /*va intoarce cate modele de pantofi avem, ca sa stim in fereastra
        grafica de cate ori poate face Next si Back utilizatorul*/
        return nrModele;
    }
    
    int getIndiceModel() {
        /*va intoarce indicele modelului curent de pantofi selectat de 
        utilizator, ca sa stim ce fisier sa alegem pentru afisare*/
        return indiceModel;
    }
    
    int getIndiceCuloare() {
        /*va intoarce indicele culorii curente de pantofi selectate de 
        utilizator, ca sa stim ce fisier sa alegem pentru afisare*/
        return indiceCuloare;
    }
    
    @Override
    public String toString(){
        return "Pantofii alesi au modelul "+indiceModel+
               " si culoarea "+culori[indiceCuloare]+
               " si se gasesc in fisierul "+numeFisierePantofi[indiceModel][indiceCuloare];
    }
}
