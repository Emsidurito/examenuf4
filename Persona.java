public class Persona {
    private int num_dni;
    private String nom;
    private String adreça;

    Persona(int pdni) {
        num_dni = pdni;
    }

    Persona(int pdni, String pnom) {
        num_dni = pdni;
        nom = pnom;
    }

    public int getDNI() {
        return (num_dni);
    }

    public String getNom() {
        return (nom);
    }

    public setNom(String pnom) {
        nom = pnom;
    }

    public String getAdreça() {
        return (adreça);
    }

    public setAdreça(String padreça) {
        adreça = padreça;
    }
}
