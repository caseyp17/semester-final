import org.asl.karelx.Squarebot;

import edu.fcps.karel2.Display;

/**
 *
 */
public class TestChallenge1 {
    public static void main(String[] args) {
        Display.openDefaultWorld();
        Squarebot sqrb = new Squarebot(9,3);
        sqrb.layCorners(5);
        Sentry snt = new Sentry(4,3,1);
        snt.patrol();
    }
    
}
