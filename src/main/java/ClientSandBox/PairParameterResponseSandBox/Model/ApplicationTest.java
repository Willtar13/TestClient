package ClientSandBox.PairParameterResponseSandBox.Model;

import ClientSandBox.SymbolInfo;
import org.springframework.web.client.RestTemplate;

public class ApplicationTest {

    public static void main(String args[])
    {
        RestTemplate restTemplate = new RestTemplate();
        PairParameters response = restTemplate.getForObject("http://localhost:8080/api/PairParameterInfoTest", PairParameters.class);
        response.toString();
        System.out.println("tacos");
    }

}
