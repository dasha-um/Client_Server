import java.net.*;
import java.io.*;

public class ClientMain {
    public static void main(String[] args) throws IOException {
        Socket c = new Socket(InetAddress.getByName("localhost"), 4444); //для сайта мм:"math.spbu.ru", 80; для моего сервера: "localhost", 4444
        Client m = new Client(c);
        m.start();
    }
}