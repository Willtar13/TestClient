package ClientSandBox;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[])
    {
        RestTemplate restTemplate = new RestTemplate();
        SymbolInfo response = restTemplate.getForObject("http://localhost:8080/api/PairScannerSymbolInfoTest", SymbolInfo.class);
        response.toString();
        System.out.println("tacos");
    }

}
