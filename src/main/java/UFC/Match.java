package UFC;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Match extends Combattants {
    private int id;
    private LocalDate date;
    private String endroit;

    public Match(String idCombattant, String nomCombattants, float poids, String listes, String endroit, LocalDate date) {
        super(idCombattant, nomCombattants, poids, listes);
        this.endroit = endroit;
        this.date = date;
    }

    /* public class MacthCombattants() {
        List<String> trierMatchCombattants(List<String> combattants) {
            return combattants.stream().sorted(Comparator.comparing(String::this.getClass(getPoids()))).collect(Collectors.toList());
        }

    }*/
}
