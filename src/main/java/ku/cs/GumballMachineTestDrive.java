/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs;

import ku.cs.models.GumballM;

public class GumballMachineTestDrive {
    public static void main(String[] args) {

        GumballM gumballMachine = new GumballM(5);

        gumballMachine.log();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.log();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.log();
    }
}
