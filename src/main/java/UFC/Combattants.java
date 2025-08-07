package UFC;

import java.util.ArrayList;
import java.util.List;

public class Combattants {
    private String idCombattant;
    private String nom;
    private String prenom;
    private String nomCombattants;
    private float poids;
    private List<listeTitre> listes = new ArrayList<>();

    public Combattants(String idCombattant, String nom, String prenom, String nomCombattants, float poids, List<listeTitre> listes) {
        this.idCombattant = idCombattant;
        this.nom = nom;
        this.prenom = prenom;
        this.nomCombattants = nomCombattants;
        this.poids = poids;
        this.listes = listes;
    }

    public Combattants(String nomCombattants, float poids) {
        this.nomCombattants = nomCombattants;
        this.poids = poids;
    }



    public String getIdCombattant() {
        return idCombattant;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomCombattants() {
        return nomCombattants;
    }

    public float getPoids() {
        return poids;
    }

    public List<listeTitre> getListes() {
        return listes;
    }
}
