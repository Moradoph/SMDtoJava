/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class HasQuarterState implements State{

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
        gumballM.setState(gumballM.getSoldState());
    }
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
