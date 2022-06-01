public class Persona { //Creem la class Persona que contindra diferents atributs
    private int num_dni; //Initzalitzem els valors de manera global
    private String nom;
    private String adreça;
    private int telefon;

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    
    Persona(int pdni) {
        num_dni = pdni;  //dona valor a num_dni amb la variable entrada a pdni
    }

    Persona(int pdni, String pnom) {  //Variables que recupera Persona
        num_dni = pdni; 
        nom = pnom;  //dona valor a nom amb la variable entrada a pnom
    }

    public int getDNI() {
        return (num_dni);  //quan es requereixi el DNI aquest int ens retornara el num_dni
    }

    public String getNom() {
        return (nom);   //quan es requereixi el Nom getNom ens retornara el nom
    }

    public setNom(String pnom) {
        nom = pnom; //al utilitzar setNom podrem alterar el valor de nom 
    }

    public String getAdreça() {
        return (adreça);  //quan es requereixi la adreça aquest int ens retornara l'adreça
    }

    public setAdreça(String padreça) {
        adreça = padreça;  //al utilitzar setadreça podrem alterar el valor de adreça  
    }
    
}
