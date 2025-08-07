package UFCTest;

import UFC.Combattants;
import UFC.Match;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UFCTest {
    @Test
    public void testMatch() {
    Combattants Tyson = new Combattants("1fgzs23","Tyson","Mike","Mike Tyson", 120,"Boxe");
    Combattants Marshall = new Combattants("2izjdz2","Marshall","Law","Bruce lee", 78,"Iron fist");
    Match challenger1 = new Match("1fgzs23", "Mike Tyson", "120", "Boxe","");

    }

}