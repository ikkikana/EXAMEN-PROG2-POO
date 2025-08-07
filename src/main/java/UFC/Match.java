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

    public Match(String nomCombattants, float poids) {
        super(nomCombattants, poids);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getEndroit() {
        return endroit;
    }
    public void Terminer(){
        return ;
    }

    public void MatchAmicaux(Match match) {
        Match.add(match);
    }
    public void Matchofficiels(Match match){
        long MatchOfficiel(List<String> match) {
            return match.stream()
                    .sorted( Comparator.comparing(String::this.getPoids()))
                    .collect(Collectors.toList());
        }
    public void MatchTitres(Match match){

    }




}
