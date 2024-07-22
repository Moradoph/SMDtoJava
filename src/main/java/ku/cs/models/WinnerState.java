/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class WinnerState implements State{

    GumballM gumballM;

    public WinnerState(GumballM gumballM) {
        this.gumballM = gumballM;
    }

    public void insertQuarter() {
        System.out.println();
    }

    public void ejectQuarter() {

    }

    public void turnCrank() {

    }

    public void dispense() {

    }
}
