package UFC;

public class LigueCombattants {
    private String nom;
    private String EnsembleCombatants;
    private String EnsembleMatch;

    public LigueCombattants(String nom, String ensembleCombatant, String ensembleMatch) {
        this.nom = nom;
        EnsembleCombatants = ensembleCombatant;
        EnsembleMatch = ensembleMatch;
    }

    public String getNom() {
        return nom;
    }

    public String getEnsembleCombatant() {
        return EnsembleCombatants;
    }

    public String getEnsembleMatch() {
        return EnsembleMatch;
    }


}
