import javax.swing.*;
import java.io.*;
import java.net.Socket;

/**
 * ReservationClient.java
 *
 * The reservation client
 *
 * @author Duy Bui, Christopher Hyman, G20
 * @version 11/22/2019
 */

public class ReservationClient {
    static BufferedReader uInputReader = new BufferedReader(new InputStreamReader(System.in));
    static String localHost;
    static String portString;
    static int port;
    static Socket socket;
    static BufferedReader socketReader = null;
    static BufferedWriter socketWriter = null;

    public static void main(String[] args) {
        try{
            localHost();
        }catch(IOException e) {
            e.printStackTrace();
        } finally {
            try {
                uInputReader.close();
                if (socketWriter != null) {
                    socketWriter.close();
                }
                if (socketReader != null) {
                    socketReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean isParsable(String string) {
        return string.chars()
                .mapToObj(Character::isDigit)
                .reduce(Boolean::logicalAnd)
                .orElse(Boolean.FALSE);
    }

    public static void localHost() throws IOException {
        localHost = JOptionPane.showInputDialog(null, "What is the hostname you'd like to connect to?", null, JOptionPane.QUESTION_MESSAGE);
        if (localHost == null) {
            invalidInput();//isnt running this for some reason
            localHost();
        } else {
            port();
        }
    }

    public static void port() throws IOException {
        portString = JOptionPane.showInputDialog(null, "What is the port you'd like to connect to?", null, JOptionPane.QUESTION_MESSAGE);
        if (portString == null){
            invalidInput();
            port();
        } else if (!isParsable(portString)){
            invalidInput();
            port();
        } else {
            System.out.println("got here");
            port = Integer.parseInt(portString);
            socket = new Socket(localHost, port);
            socketWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        }
        chooseAirline();
    }

    public static void chooseAirline() {



    }

    public static void invalidInput() {
        JOptionPane.showMessageDialog(null, "Please produce a valid input!", null, JOptionPane.ERROR_MESSAGE);
    }
}

