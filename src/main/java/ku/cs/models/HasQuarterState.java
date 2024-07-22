/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

import java.util.Random;

public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballM gumballM;

    public HasQuarterState(GumballM gumballM) {
        this.gumballM = gumballM;
    }

    public void insertQuarter() {
        System.out.println("You can’t insert another quarter");
    }
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballM.setState(gumballM.getNoQuarterState());
    }
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballM.getGumball() > 1)) {
            gumballM.setState(gumballM.getWinnerState());
        } else {
            gumballM.setState(gumballM.getSoldState());
        }
    }
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
