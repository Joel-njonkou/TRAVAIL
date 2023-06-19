import entities.Personne;

public class PersonneMain {
    public static void main(String[] args) throws Exception {
        Personne p = new Personne();
        p.setNom("Coupdetrix");
        p.setAge(25);
        p.afficher();
        p.diviserParDeux();
    }
}