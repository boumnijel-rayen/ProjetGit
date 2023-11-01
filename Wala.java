public class Wala {

    private int id;
    private String nom;
    private String prenom;
    private String adresse;
  // Constructeurs

    public Wala() {
    }

    public Wala(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
  // Méthodes d'accès en lecture et écriture
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
 
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
        public int getAdresse() {
        return adresse;
    }

    public void setAdresse(int adresse) {
        this.adresse = adresse;
    }

   @Override
    public boolean equals(String prenom) {
        
        return false;
    }
}
