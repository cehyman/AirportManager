/**
 * Alaska.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class Alaska implements Airline {
    private final int maxSeats = 100;
    private int currentSeats = 0;
    private Passenger[] passengers = new Passenger[maxSeats];
    private Gate gate;

    public Alaska() {

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
        return "Alaska Airlines is proud to serve the strong and knowledgeable Boilermakers from Purdue University.\n" +
                "We primarily fly westward, and often have stops in Alaska and California.\n" +
                "We have first class amenities, even in coach class.\n" +
                "We provide fun snacks such as pretzels and goldfish.\n" +
                "We also have comfortable seats, and free WiFi.\n" +
                "We hope you choose Alaska Airlines for your next itinerary!";
    }
}
