import utez.Service2;
import utez.Service2;
import utez.Service2Service;

import java.util.Scanner;

public class SoapClient2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Service2Service service= new Service2Service();
        Service2 port=service.getService2Port();
        System.out.println("Ingresa una palabra");
        String response = port.resposeMessage(scanner.nextLine().toUpperCase());
        System.out.println(response);
    }
}
