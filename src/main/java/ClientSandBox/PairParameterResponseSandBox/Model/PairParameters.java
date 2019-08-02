package ClientSandBox.PairParameterResponseSandBox.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PairParameters {

    @JsonProperty
    PairParametersVol pairParametersVol;

    @JsonProperty
    PairParametersSymbolInfo pairParametersSymbolInfo;

    @JsonProperty
    PairParametersTradeInfo pairParametersTradeInfo;

    @JsonProperty
    String pairSymbol;

    @JsonProperty
    BigDecimal lastPrice;

    public PairParameters()
    {

    }
}
