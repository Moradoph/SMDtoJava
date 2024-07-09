/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs;

import ku.cs.models.GumballM;

public class Main {
    public static void main(String[] args) {
        GumballM machine = new GumballM(5);
        machine.log();
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispenseGumball();

        machine.log();
        machine.insertQuarter();
        machine.ejectsQuarter();
        machine.turnCrank();

        machine.log();
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispenseGumball();
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispenseGumball();
        machine.turnCrank();

        machine.log();
        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispenseGumball();
        machine.insertQuarter();
        machine.turnCrank();
        machine.dispenseGumball();
        machine.insertQuarter();
        machine.turnCrank();

        machine.log();
    }
}
