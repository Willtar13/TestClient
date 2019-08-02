package ClientSandBox.PairParameterResponseSandBox.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PairParametersVol {

    @JsonProperty
    ScalperStatus pairTradeStatus;

    @JsonProperty
    Double shortVolPercent;

    @JsonProperty
    Double acceptableShortVolPercent = .015;

    PairParametersVol(){

    }
}
