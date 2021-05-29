package loadpage.modelAssert;

import com.google.gson.annotations.SerializedName;

public class Target {

    private String symbol;
    private String time;
    private String prefix;
    private String open;
    private String name;
    private String high;
    private String low;
    private String close;
    private String volume;
    private String variation;

    @SerializedName("financial-volume")
    private String financialVolume;

    @SerializedName("iv-1y-min")
    private String iv1yMin;

    @SerializedName("iv-1y-max")
    private String iv1yMax;

    @SerializedName("iv-1y-rank")
    private String iv1Yrank;

    @SerializedName("iv-1y-percentile")
    private String iv1Ypercentile;

    @SerializedName("iv-6m-min")
    private String iv6mMin;

    @SerializedName("iv-6m-max")
    private String iv6mMax;

    @SerializedName("iv-6m-rank")
    private String iv6mRank;

    @SerializedName("iv-6m-percentile")
    private String iv6mPercentile;

    @SerializedName("iv-current")
    private String ivCurrent;

    @SerializedName("ewma-1y-min")
    private String ewma1yMin;

    @SerializedName("ewma-1y-max")
    private String ewma1YMax;

    @SerializedName("ewma-1y-rank")
    private String ewma1yRank;

    @SerializedName("ewma-1y-percentile")
    private String ewma1yPercentile;

    @SerializedName("ewma-6m-min")
    private String ewma6mMin;

    @SerializedName("ewma-6m-max")
    private String ewma6mMax;

    @SerializedName("ewma-6m-rank")
    private String ewma6mRank;

    @SerializedName("ewma-6m-percentile")
    private String ewma6mPercentile;

    @SerializedName("ewma-current")
    private String ewmaCurrent;

    @SerializedName("short-term-trend")
    private String shortTermTrend;

    @SerializedName("middle-term-trend")
    private String middleTermTrend;

    @SerializedName("portfolio")
    private Object portfolio;

    private String sector;
    private String subsector;
    private String segment;


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public String getFinancialVolume() {
        return financialVolume;
    }

    public void setFinancialVolume(String financialVolume) {
        this.financialVolume = financialVolume;
    }

    public String getIv1yMin() {
        return iv1yMin;
    }

    public void setIv1yMin(String iv1yMin) {
        this.iv1yMin = iv1yMin;
    }

    public String getIv1yMax() {
        return iv1yMax;
    }

    public void setIv1yMax(String iv1yMax) {
        this.iv1yMax = iv1yMax;
    }

    public String getIv1Yrank() {
        return iv1Yrank;
    }

    public void setIv1Yrank(String iv1Yrank) {
        this.iv1Yrank = iv1Yrank;
    }

    public String getIv1Ypercentile() {
        return iv1Ypercentile;
    }

    public void setIv1Ypercentile(String iv1Ypercentile) {
        this.iv1Ypercentile = iv1Ypercentile;
    }

    public String getIv6mMin() {
        return iv6mMin;
    }

    public void setIv6mMin(String iv6mMin) {
        this.iv6mMin = iv6mMin;
    }

    public String getIv6mMax() {
        return iv6mMax;
    }

    public void setIv6mMax(String iv6mMax) {
        this.iv6mMax = iv6mMax;
    }

    public String getIv6mRank() {
        return iv6mRank;
    }

    public void setIv6mRank(String iv6mRank) {
        this.iv6mRank = iv6mRank;
    }

    public String getIv6mPercentile() {
        return iv6mPercentile;
    }

    public void setIv6mPercentile(String iv6mPercentile) {
        this.iv6mPercentile = iv6mPercentile;
    }

    public String getIvCurrent() {
        return ivCurrent;
    }

    public void setIvCurrent(String ivCurrent) {
        this.ivCurrent = ivCurrent;
    }

    public String getEwma1yMin() {
        return ewma1yMin;
    }

    public void setEwma1yMin(String ewma1yMin) {
        this.ewma1yMin = ewma1yMin;
    }

    public String getEwma1YMax() {
        return ewma1YMax;
    }

    public void setEwma1YMax(String ewma1YMax) {
        this.ewma1YMax = ewma1YMax;
    }

    public String getEwma1yRank() {
        return ewma1yRank;
    }

    public void setEwma1yRank(String ewma1yRank) {
        this.ewma1yRank = ewma1yRank;
    }

    public String getEwma1yPercentile() {
        return ewma1yPercentile;
    }

    public void setEwma1yPercentile(String ewma1yPercentile) {
        this.ewma1yPercentile = ewma1yPercentile;
    }

    public String getEwma6mMin() {
        return ewma6mMin;
    }

    public void setEwma6mMin(String ewma6mMin) {
        this.ewma6mMin = ewma6mMin;
    }

    public String getEwma6mMax() {
        return ewma6mMax;
    }

    public void setEwma6mMax(String ewma6mMax) {
        this.ewma6mMax = ewma6mMax;
    }

    public String getEwma6mRank() {
        return ewma6mRank;
    }

    public void setEwma6mRank(String ewma6mRank) {
        this.ewma6mRank = ewma6mRank;
    }

    public String getEwma6mPercentile() {
        return ewma6mPercentile;
    }

    public void setEwma6mPercentile(String ewma6mPercentile) {
        this.ewma6mPercentile = ewma6mPercentile;
    }

    public String getEwmaCurrent() {
        return ewmaCurrent;
    }

    public void setEwmaCurrent(String ewmaCurrent) {
        this.ewmaCurrent = ewmaCurrent;
    }

    public String getShortTermTrend() {
        return shortTermTrend;
    }

    public void setShortTermTrend(String shortTermTrend) {
        this.shortTermTrend = shortTermTrend;
    }

    public String getMiddleTermTrend() {
        return middleTermTrend;
    }

    public void setMiddleTermTrend(String middleTermTrend) {
        this.middleTermTrend = middleTermTrend;
    }


    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getSubsector() {
        return subsector;
    }

    public void setSubsector(String subsector) {
        this.subsector = subsector;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }


}
