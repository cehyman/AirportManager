/**
 * Delta.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class Delta implements Airline {
    private final int maxSeats = 100;
    private int currentSeats = 0;
    private Passenger[] passengers = new Passenger[maxSeats];

    public Delta() {

    }

    @Override
    public int getCurrentSeats() {
        return currentSeats;
    }

    @Override
    public int getMaxSeats() {
        return maxSeats;
    }

    @Override
    public String[] printPassengerList() {
        String[] returnObject = new String[currentSeats];

        for (int i = 0; i < currentSeats; i++) returnObject[i] = passengers[i].toString();

        return returnObject;
    }

    @Override
    public synchronized void addPassenger(Passenger passenger) {
        passengers[currentSeats] = passenger;
        currentSeats++;
    }

    @Override
    public String getText() {
        return "Delta Airlines is proud to be one of the five premier Airlines atPurdue University.\n" +
                "We are extremely offer exceptional services, with free limited WiFi for all customers.\n" +
                "Passengers who use T-Mobile as a cell phone carrier get additional benefits.\n" +
                "We are also happy to offer power outlets in each seat for passenger use.\n" +
                "We hope you choose to fly Delta as your next Airline.";
    }
}
