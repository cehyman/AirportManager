/**
 * Passenger.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class Passenger {
    public int age;
    public String firstName;
    public String lastName;

    public Passenger(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName.substring(0, 1).toUpperCase() + ". " + lastName.toUpperCase() + ", " + age;
    }
}
