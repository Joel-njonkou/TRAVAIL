package entities;

import java.util.Scanner;

public class Personne {
    private String nom;
    private int age;
    private double[] comptes = new double[5];
    public Personne(){};//-------LE CONSTRUCTEUR DOIT ETRE public
    public Personne(String leNom, int lAge/*  double[] compte*/){
        this.nom=leNom;
        this.age=lAge;
        //this.comptes=compte;
    }
    //---GETTERS
    public String getNom(){
        return this.nom;
    }
    public int getAge(){
        return this.age;
    }

    
    //---SETTERS
    public void setNom(String leNom)
    {
        this.nom=leNom;
    }
    public void setAge(int lAge)
    {
        this.age=lAge;
    }
    /*public void setList(double[] compte ){
        this.comptes=compte;
    }*/
    
     //----Fonction du compte
     public void lecture(){
        try (Scanner scanner = new Scanner(System.in))
        {
            for(int j=0; j<comptes.length; j++)
            {
                System.out.println("\t\tVeuillez entrer le solde du compte numéro "+(j+1));
                comptes[j]= scanner.nextDouble();
                /*scanner.close();*/ // on utilise plus scanner close
            }
        }
     }

     public void affichage(){
        System.out.println("\t");
        for(int j=0; j<comptes.length; j++)
        {
            System.out.print(comptes[j]+" \t");
        }
     }
     //---Fonction afficher
    public void afficher(){
        System.out.println("\n_________________________________________________________________\n");
        System.out.println("\tNom: "+this.nom);
        System.out.println("\tAge : "+this.age+" ans");
        System.out.println("\t\tVeuillez entrer les informations de "+this.nom+": ");
        System.out.println("_________________________________________________________________\n");
        /*for (double compte : comptes) {
            System.out.println("\t" + compte);
        } */
        lecture();
        System.out.println("\n_________________________________________________________________\n");
        System.out.println("\tNom: "+this.nom);
        System.out.println("\tAge : "+this.age+" ans\n");
        affichage();
        System.out.println("\n_________________________________________________________________\n");  
     }
     public void diviserParDeux(){
        for (int i = 0; i < comptes.length; i++) {
            comptes[i] /= 2;
        }
        System.out.println("\nComptes divisees par 2");
        System.out.println("\t");
        for(int j=0; j<comptes.length; j++)
        {
            System.out.print(comptes[j]+"\t");
        }
        System.out.println("\n");
     }

}
