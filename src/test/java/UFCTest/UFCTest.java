package UFCTest;

import UFC.Combattants;
import UFC.Match;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UFCTest {
    @Test
    public void testMatch() {
    Combattants Tyson = new Combattants("1fgzs23","Tyson","Mike","Mike Tyson", 120,"BoxeChampion");
    Combattants Marshall = new Combattants("2izjdz2","Marshall","Law","Bruce lee", 78,"Ironfist");
    Combattants Miary = new Combattants("3fzkf","Miary","Zo","Miary Zo", 64,"none");
    Match challenger1 = new Match("Mike Tyson", 120);
    Match challenger2 = new Match("Bruce lee", 78);

    assert equals("Mike Tyson");
    }

}