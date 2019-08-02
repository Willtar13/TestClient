package ClientSandBox.PairParameterResponseSandBox.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PairParametersTradeInfo {

    @JsonProperty
    BigDecimal coinQty;

    @JsonProperty
    BigDecimal spreadSize;

    PairParametersTradeInfo(){

    }
}
