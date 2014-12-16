import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 *
 */
public class Sentry extends Uberbot {
    public Sentry(){
        super(1,1,Display.NORTH,Display.INFINITY);
    }
    public Sentry(int x,int y,int dir){
        super(x,y,dir,Display.INFINITY);
    }
    /**
     * Patrol an area in a clockwise direction.
     *
     * Move forward until next to a beeper then turn right.  Repeat indefinitely.
     *
     */
    public void patrol() {
        int dir=1;
        super.face(dir);
        super.move();
        while(true==true){
            while(super.nextToABeeper()==false){
                super.move();
            }
            if(dir==0){
                dir=3;
            }else{
                dir--;
            }
            this.face(dir);
            super.move();
        }
    }
}
