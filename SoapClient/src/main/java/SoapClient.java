/*import utez.Service;
import utez.ServiceService;

import java.util.Scanner;

public class SoapClient {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ServiceService service= new ServiceService();
        Service port=service.getServicePort();
        String response ="";
        while (!response.equals("Adivinaste!")){
            System.out.println("Ingresa un número");
            response=port.resposeMessage(scanner.next());
            System.out.println(response);
        }
    }
}
*/