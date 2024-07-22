/**
 * StudentID: 6510450861
 * Name: Moradop Hengprasert
 */

package ku.cs;

import ku.cs.models.GumballM;
public class GumballMRequestII {
    public static void main(String[] args) {
        GumballM machine = new GumballM(5);

        machine.log();

        machine.insertQuarter();
        machine.turnCrank();

        machine.choose("Mango");
        machine.choose("Orange");
        machine.turnCrank();

        machine.log();

        machine.insertQuarter();
        machine.turnCrank();

        machine.choose("Papaya");
        machine.turnCrank();
    }
}
