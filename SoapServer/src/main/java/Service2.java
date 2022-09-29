import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name ="Service2", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Service2 {
    public String consonantFinder(String words){
        String consonants="BCDFGHJKLMNÑPQRSTVWXYZ";
        String noVowels="";
        for(int i=0;i<words.length();i++){
            for(int j=0; j<consonants.length();j++){
                if(words.charAt(i)==consonants.charAt(j)){
                    noVowels=noVowels+consonants.charAt(j);
                    System.out.println(noVowels);
                }
            }
        }
        return noVowels;
    }
@WebMethod(operationName = "resposeMessage")
    public String resposeMessage(@WebParam(name = "messaage")String words){
        String noVowels=consonantFinder(words);
        return noVowels;
    }
    public static void main(String[] args) {
        System.out.println("Iniciando el servidor");
        Endpoint.publish("http://localhost:8081/Service2", new Service2());
        System.out.println("Waiting requests");
    }
}
