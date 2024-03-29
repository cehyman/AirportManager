import java.io.Serializable;

/**
 * Airline.java
 *
 * An interface for airline classes
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */
public interface Airline extends Serializable {
    int getCurrentSeats();
    int getMaxSeats();
    String[] printPassengerList();
    void addPassenger(Passenger passenger);
    String getText();
}
