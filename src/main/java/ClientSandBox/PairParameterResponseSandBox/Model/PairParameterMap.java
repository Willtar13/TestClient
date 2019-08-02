package ClientSandBox.PairParameterResponseSandBox.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.concurrent.ConcurrentHashMap;

public class PairParameterMap {

    //fields
    @JsonProperty
    ConcurrentHashMap<String, PairParameters> pairParametersMapInstance;

    public PairParameterMap(){

    }
}
