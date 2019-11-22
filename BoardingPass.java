/**
 * BoardingPass.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class BoardingPass {
    String airline;
    String gate;
    Passenger passenger;

    public BoardingPass(String airline, Gate gate, Passenger passenger) {
        this.airline = airline + " Airlines";
        this.gate = gate.toString();
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "BOARDING PASS FOR FLIGHT 18000 WITH " + airline + "\n" +
                "PASSENGER FIRST NAME : " + passenger.getFirstName().toUpperCase() + "\n" +
                "PASSENGER LAST NAME : " + passenger.getLastName().toUpperCase() + "\n" +
                "PASSENGER AGE : " + passenger.getAge() + "\n" +
                "You can now begin boarding at gate " + gate;
    }
}
