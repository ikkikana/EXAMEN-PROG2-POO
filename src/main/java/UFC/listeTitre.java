package UFC;

import java.util.List;

public class listeTitre extends Combattants {
    private String titre;

    public listeTitre(String idCombattant, String nom, String prenom, String nomCombattants, float poids, List<listeTitre> listes, String titre) {
        super(idCombattant, nom, prenom, nomCombattants, poids, listes);
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = "Champion de " + titre;
    }
}
