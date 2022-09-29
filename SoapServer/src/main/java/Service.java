import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name ="Service", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Service {
    public int randNumber(){
        return (int) (Math.random()*3+1);
    }
    public boolean numberCompare(int number){
        boolean result=false;
        if(number== randNumber()){
            result= true;
        }
        return result;
    }
    @WebMethod(operationName = "resposeMessage")
    public String responseMessage(@WebParam(name = "message") String numberS){
        int number=Integer.parseInt(numberS);
        boolean result=false;
        result=numberCompare(number);
        if(result){
            return "Adivinaste!";
        }else{
            return "Número incorrecto";
        }
    }

    public static void main(String[] args) {
        System.out.println("Iniciando el servidor");
        Endpoint.publish("http://localhost:8081/Service", new Service());
        System.out.println("Waiting requests");
    }
}
