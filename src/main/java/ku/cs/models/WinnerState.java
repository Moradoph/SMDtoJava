/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class WinnerState implements State {

    GumballM gumballM;

    public WinnerState(GumballM gumballM) {
        this.gumballM = gumballM;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we’re already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn’t get you another gumball!");
    }

    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballM.releaseBall();
        if (gumballM.getGumball() == 0) {
            gumballM.setState(gumballM.getSoldOutState());
        } else {
            gumballM.releaseBall();
            gumballM.setChosenFlavor(null);
            if (gumballM.getGumball() > 0) {
                gumballM.setState(gumballM.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballM.setState(gumballM.getSoldOutState());
            }
        }
    }
}