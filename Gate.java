/**
 * Gate.java
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class Gate {
    private char letter;
    private int number;
    private Random random;

    public Gate() {
        this.random = new Random();
        this.letter = (char) (random.nextInt(2) + 'A');
        this.number = random.nextInt(17) + 1;
    }

    @Override
    public String toString() {
        String returnObject = "" + letter;
        if (number < 10) {
            return returnObject + "0" + number;
        } else return returnObject + number;
    }
}
