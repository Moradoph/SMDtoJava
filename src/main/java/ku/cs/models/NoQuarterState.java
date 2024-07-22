/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class NoQuarterState implements State {

    GumballM gumballM;

    public NoQuarterState(GumballM gumballM) {
        this.gumballM = gumballM;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballM.setState(gumballM.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }
}
