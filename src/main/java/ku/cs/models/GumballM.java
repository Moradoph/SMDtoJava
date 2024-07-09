/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs.models;

public class GumballM {
    private int gumball;
    private int quarter;
    private int noQuarter = 0;
    private int hasQuarter = 1;
    private int gumballSold = 2;
    private int outOfGumball = 3;
    private int currentState = noQuarter;

    public GumballM(int gumball) {
        this.gumball = gumball;
        this.quarter = 0;
    }

    public void insertQuarter() {
        if (this.gumball == 0) {
            System.out.println("You can't insert a quarter, the machine is sold out");
        } else if (currentState == noQuarter) {
            System.out.println("You inserted a quarter");
            this.quarter += 1;
            currentState = hasQuarter;
        } else if (currentState == hasQuarter) {
            System.out.println("You can't insert another quarter");
        }
    }


    public void ejectsQuarter() {
        if (currentState == hasQuarter) {
            System.out.println("Quarter returned");
            this.quarter -= 1;
            currentState = noQuarter;
        }
    }

    public void turnCrank() {
        if (currentState == hasQuarter) {
            System.out.println("You turned...");
            this.quarter -= 1;
            currentState = gumballSold;
        } else {
            if (currentState == noQuarter) {
                System.out.println("You turned but there's no quarter");
            }
            if (currentState == outOfGumball) {
                System.out.println("You turned, but there are no gumball");
            }
        }
    }

    public void dispenseGumball() {
        if (currentState == gumballSold) {
            if (gumball > 0) {
                System.out.println("A gumball comes rolling out the slot");
                this.gumball -= 1;
                currentState = noQuarter;
                if (this.gumball == 0) {
                    System.out.println("Oops, out of gumballs!");
                    currentState = outOfGumball;
                }
            }
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
}

