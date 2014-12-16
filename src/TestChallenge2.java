import edu.fcps.karel2.Display;

/**
 *
 */
public class TestChallenge2 {
    public static void main(String[] args) {
        Display.openWorld("src/maps/pasture.map");
        Display.setSize(15, 15);
        Horse horsey = new Horse(5,2);
        horsey.wander(36,7);
        horsey.explode();
    }
    
}
