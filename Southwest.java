/**
 * Southwest.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class Southwest implements Airline {
    private final int maxSeats = 100;
    private int currentSeats = 0;
    private Passenger[] passengers = new Passenger[maxSeats];
    private Gate gate = new Gate();

    public Southwest() {

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
        if (currentSeats == 1) gate = new Gate();
    }


    @Override
    public String getText() {
        return "Southwest Airlines is proud to offer flights to Purdue University.\n"+
                "We are happy to offer free in flight wifi, as well as our amazing snacks.\n" +
                "In additions, we offer flights for much cheaper than other airlines," +
                " and offer two free checked bags.\n" +
                "We hope you choose Southwest for your next flight.\n";
    }
}
