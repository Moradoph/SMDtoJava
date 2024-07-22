/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class GumballM {

    private int gumball;
    private String chosenFlavor;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;

    public GumballM(int numberGumball) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.chosenFlavor = null;
        this.gumball = numberGumball;
        if (gumball > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setChosenFlavor(String flavor) {
        this.chosenFlavor = flavor;
    }

    public void releaseBall() {
        System.out.println("A " + chosenFlavor + " comes rolling out the slot...");
        if (gumball != 0) {
            gumball = gumball - 1;
        }
    }

    public void choose(String flavor) {
        if (state == hasQuarterState) {
            if ("Mango".equals(flavor) || "Orange".equals(flavor)) {
                setChosenFlavor(flavor);
                System.out.println("You have chosen the flavor " + flavor);
            } else {
                System.out.println("Invalid flavor chosen");
            }
        } else {
            System.out.println("You need to insert a quarter first");
        }
    }

    public void log() {
        System.out.println();
        System.out.println("Mighty Gumball, Inc.");
        System.out.println("Java-enabled Standing Gumball Model #2004");
        System.out.println("Inventory: " + this.getGumball() + " gumballs");
        if (this.gumball <= 0) {
            System.out.println("Machine is sold out");
        } else {
            System.out.println("Machine is waiting for quarter");
        }
        System.out.println();
    }

    public int getGumball() {
        return this.gumball;
    }

    public String getChosenFlavor() {
        return chosenFlavor;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getState() {
        return state;
    }
}

