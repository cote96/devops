
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader buffer = new BufferedReader(reader);
            System.out.println("Ingresa tu nombre: ");
            String nombre = buffer.readLine();
            System.out.println("Hola " + nombre + "!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
