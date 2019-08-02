package ClientSandBox;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class SymbolInfo {

    @JsonProperty
    String quoteAsset;

    @JsonProperty
    BigDecimal tickSize;

    @JsonProperty
    private BigDecimal minNotional;

    @JsonProperty
    private BigDecimal stepSize;

    @JsonProperty
    private int intValueTickSize;

    @JsonProperty
    private int intValueStepSize;

    public SymbolInfo(){

    }

}
