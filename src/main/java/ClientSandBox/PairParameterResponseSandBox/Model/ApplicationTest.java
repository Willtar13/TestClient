package ClientSandBox.PairParameterResponseSandBox.Model;

import ClientSandBox.SymbolInfo;
import org.springframework.web.client.RestTemplate;

public class ApplicationTest {

    public static void main(String args[])
    {
        RestTemplate restTemplate = new RestTemplate();
        PairParameterMap response = restTemplate.getForObject("http://localhost:8080/api/PairScannerWithUpdates", PairParameterMap.class);
        response.toString();
        System.out.println("tacos");
        System.out.println(response.toString());
    }

}
