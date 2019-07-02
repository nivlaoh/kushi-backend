package com.hokaicheng.service;

import com.hokaicheng.config.StockConfig;
import com.hokaicheng.model.Stock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.PostConstruct;

@Service
public class StockServiceImpl implements StockService {
    private static final Logger LOG = LoggerFactory.getLogger(StockServiceImpl.class);
    @Autowired
    private StockConfig stockConfig;
    private WebClient client;

    @PostConstruct
    public void setup() {
        client = WebClient.create(stockConfig.getBaseUrl());
    }

    public Mono<Stock> getStockBySymbol(String symbol) {
        MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<>();
        queryParams.add("function", "TIME_SERIES_INTRADAY");
        queryParams.add("symbol", symbol);
        queryParams.add("interval", "5min");
        queryParams.add("apikey", stockConfig.getAccessToken());
        LOG.info("Calling stock com.hokaicheng.service for [{}]", symbol);
        return client
                .get()
                .uri(uriBuilder -> uriBuilder
                        .path("/query")
                        .queryParams(queryParams)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Stock.class);
    }

    public Flux<Stock> getStocksInList() {
        return null;
    }
}
