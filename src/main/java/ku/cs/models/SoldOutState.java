/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class SoldOutState implements State{

    GumballM gumballM;

    public SoldOutState(GumballM gumballM) {
        this.gumballM = gumballM;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumball");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
