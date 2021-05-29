package loadpage.modelAssert;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Series {

    private String serieAsssetName;
    private String id;
    private String name;
    @SerializedName("due-date")
    private String dueDate;
    @SerializedName("days-to-maturity")
    private String daysToMaturity;
    private String type;

    private List<Options> listOptions;

    public String getSerieAsssetName() {
        return serieAsssetName;
    }

    public void setSerieAsssetName(String serieAsssetName) {
        this.serieAsssetName = serieAsssetName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDaysToMaturity() {
        return daysToMaturity;
    }

    public void setDaysToMaturity(String daysToMaturity) {
        this.daysToMaturity = daysToMaturity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Options> getListOptions() {
        return listOptions;
    }

    public void setListOptions(List<Options> listOptions) {
        this.listOptions = listOptions;
    }
}
