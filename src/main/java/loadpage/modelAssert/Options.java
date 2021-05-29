package loadpage.modelAssert;

import com.google.gson.annotations.SerializedName;

public class Options {

    @SerializedName("maturity-type")
    private String maturityType;
    private String close;
    private String strike;
    private String variation;
    private String volume;
    @SerializedName("financial-volume")
    private String financialVolume;
    @SerializedName("spot-price")
    private String spotPrice;
    private String bid;
    private String ask;
    private String open;
    private String high;
    private String low;
    @SerializedName("market-maker")
    private String marketMaker;


    public String getFinancialVolume() {
        return financialVolume;
    }

    public void setFinancialVolume(String financialVolume) {
        this.financialVolume = financialVolume;
    }

    public String getMaturityType() {
        return maturityType;
    }

    public void setMaturityType(String maturityType) {
        this.maturityType = maturityType;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getStrike() {
        return strike;
    }

    public void setStrike(String strike) {
        this.strike = strike;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getAsk() {
        return ask;
    }

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getMarketMaker() {
        return marketMaker;
    }

    public void setMarketMaker(String marketMaker) {
        this.marketMaker = marketMaker;
    }
}
