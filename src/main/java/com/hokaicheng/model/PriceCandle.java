package com.hokaicheng.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.math.BigDecimal;

public class PriceCandle {
    @JsonAlias("1. open")
    private BigDecimal open;
    @JsonAlias("2. high")
    private BigDecimal high;
    @JsonAlias("3. low")
    private BigDecimal low;
    @JsonAlias("4. close")
    private BigDecimal close;
    @JsonAlias("5. volume")
    private BigDecimal volume;

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getClose() {
        return close;
    }

    public void setClose(BigDecimal close) {
        this.close = close;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

}
