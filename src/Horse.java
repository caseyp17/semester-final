import org.asl.karelx.Wanderer;

/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {
    
    public Horse(){
        super();
    }
    public Horse(int x, int y){
        super(x,y);
    }
    /**
     * Wander around in random directions until a specified number of steps have been taken.
     * At regular intervals specified by timer, drop a beeper.
     *
     * @param count		the total number of steps to take
     * @param timer		the interval at which to drop a beeper
     *
     * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
     */
    public void wander(int count, int timer) {
        for(int cur=0;cur<count;cur++){
            super.wander();
            if(cur%timer==0&&cur>0){
                super.putBeeper();
            }
        }
    }
}
