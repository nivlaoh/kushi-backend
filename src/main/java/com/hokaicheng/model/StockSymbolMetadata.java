package com.hokaicheng.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class StockSymbolMetadata {
    @JsonAlias("1. Information")
    private String information;
    @JsonAlias("2. Symbol")
    private String symbol;
    @JsonAlias("3. Last Refreshed")
    private String lastRefreshed;
    @JsonAlias("4. Interval")
    private String interval;
    @JsonAlias("5. Output Size")
    private String outputSize;
    @JsonAlias("6. Time Zone")
    private String timezone;

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getLastRefreshed() {
        return lastRefreshed;
    }

    public void setLastRefreshed(String lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getOutputSize() {
        return outputSize;
    }

    public void setOutputSize(String outputSize) {
        this.outputSize = outputSize;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
