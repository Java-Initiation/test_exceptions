package testexceptions;

public class Pays {

    private String nom;
    private int nombreHabitants, pib;

    public Pays(String nom, int nombreHabitants, int pib) {
        this.nom = nom;
        this.nombreHabitants = nombreHabitants;
        this.pib = pib;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNombreHabitants() {
        return nombreHabitants;
    }

    public void setNombreHabitants(int nombreHabitants) {
        this.nombreHabitants = nombreHabitants;
    }

    public int getPib() {
        return pib;
    }

    public void setPib(int pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", nombreHabitants=" + nombreHabitants +
                ", pib=" + pib +
                '}';
    }

}
