package com.hokaicheng.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.Map;

public class Stock {
    @JsonAlias("Meta Data")
    private StockSymbolMetadata metadata;
    @JsonAlias("Time Series (5min)")
    private Map<String, PriceCandle> timeSeries;

    public StockSymbolMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(StockSymbolMetadata metadata) {
        this.metadata = metadata;
    }

    public Map<String, PriceCandle> getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(Map<String, PriceCandle> timeSeries) {
        this.timeSeries = timeSeries;
    }
}
