/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class GumballM {

    private int gumball;

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state = soldOutState;

    public GumballM(int numberGumball) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);

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

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (gumball != 0) {
            gumball = gumball - 1;
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

    public State getState() {
        return state;
    }

//    public void insertQuarter() {
//        if (this.gumball == 0) {
//            System.out.println("You can't insert a quarter, the machine is sold out");
//        } else if (currentState == noQuarter) {
//            System.out.println("You inserted a quarter");
//            this.quarter += 1;
//            currentState = hasQuarter;
//        } else if (currentState == hasQuarter) {
//            System.out.println("You can't insert another quarter");
//        }
//    }
//
//
//    public void ejectsQuarter() {
//        if (currentState == hasQuarter) {
//            System.out.println("Quarter returned");
//            this.quarter -= 1;
//            currentState = noQuarter;
//        }
//    }
//
//    public void turnCrank() {
//        if (currentState == hasQuarter) {
//            System.out.println("You turned...");
//            this.quarter -= 1;
//            currentState = gumballSold;
//        } else {
//            if (currentState == noQuarter) {
//                System.out.println("You turned but there's no quarter");
//            }
//            if (currentState == outOfGumball) {
//                System.out.println("You turned, but there are no gumball");
//            }
//        }
//    }
//
//    public void dispenseGumball() {
//        if (currentState == gumballSold) {
//            if (gumball > 0) {
//                System.out.println("A gumball comes rolling out the slot");
//                this.gumball -= 1;
//                currentState = noQuarter;
//                if (this.gumball == 0) {
//                    System.out.println("Oops, out of gumballs!");
//                    currentState = outOfGumball;
//                }
//            }
//        }
//    }

}

