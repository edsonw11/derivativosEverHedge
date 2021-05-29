package loadpage.modelAssert;

import com.google.gson.annotations.SerializedName;

public class Screen {


   private String id;
   private Target target;


    @SerializedName("interest-rate-id")
    private String interestRateId;

    @SerializedName("interest-rate")
    private String interestRate;

    @SerializedName("locked-days-to-maturity")
    private String lockedDaysToMaturity;

    @SerializedName("locked-spot-price")
    private String lockedSpotPrice;

    @SerializedName("locked-volatility")
    private String lockedVolatility;

    @SerializedName("ui-settings")
    private Object uiSettings;


    @SerializedName("series")
    private Object listSeries;



    public Object getListSeries() {
        return listSeries;
    }

    public void setListSeries(Object listSeries) {
        this.listSeries = listSeries;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }

    public String getInterestRateId() {
        return interestRateId;
    }

    public void setInterestRateId(String interestRateId) {
        this.interestRateId = interestRateId;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getLockedDaysToMaturity() {
        return lockedDaysToMaturity;
    }

    public void setLockedDaysToMaturity(String lockedDaysToMaturity) {
        this.lockedDaysToMaturity = lockedDaysToMaturity;
    }

    public String getLockedSpotPrice() {
        return lockedSpotPrice;
    }

    public void setLockedSpotPrice(String lockedSpotPrice) {
        this.lockedSpotPrice = lockedSpotPrice;
    }

    public String getLockedVolatility() {
        return lockedVolatility;
    }

    public void setLockedVolatility(String lockedVolatility) {
        this.lockedVolatility = lockedVolatility;
    }



}