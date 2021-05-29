package loadpage.modelAssert;

import com.google.gson.annotations.SerializedName;

public class Portfolio {

  @SerializedName("average-price")
  private String averagePrice;
  private String amount;

  public String getAveragePrice() {
    return averagePrice;
  }

  public void setAveragePrice(String averagePrice) {
    this.averagePrice = averagePrice;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }
}
