import edu.fcps.karel2.Display;

/**
 *
 */
public class TestChallenge3 {
    public static void main(String[] args) {
        int origX = 3;
        int origY = 5;
        int width = 3;
        int height = 6;
        Display.openWorld("src/maps/farm.map");
        Display.setSize(12,12);
        BeepFarmer bpfrmr = new BeepFarmer(origX,origY,0);
        bpfrmr.reap(width, height);
        bpfrmr.teleport(1, 1);
        while(bpfrmr.hasBeepers()){
            bpfrmr.putBeeper();
        }
        bpfrmr.teleport(2,1);
    }
    
}
