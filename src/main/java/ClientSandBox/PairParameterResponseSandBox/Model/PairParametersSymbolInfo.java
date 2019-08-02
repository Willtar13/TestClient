package ClientSandBox.PairParameterResponseSandBox.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class PairParametersSymbolInfo {

    @JsonProperty
    private String quoteAsset;

    @JsonProperty
    private BigDecimal tickSize;

    @JsonProperty
    private BigDecimal minNotional;

    @JsonProperty
    private BigDecimal stepSize;

    @JsonProperty
    private int intValueTickSize;

    @JsonProperty
    private int intStepSizeValue;

    public PairParametersSymbolInfo(){

    }

}
