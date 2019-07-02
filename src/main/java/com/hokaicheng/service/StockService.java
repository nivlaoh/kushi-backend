package com.hokaicheng.service;

import com.hokaicheng.model.Stock;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StockService {

    Mono<Stock> getStockBySymbol(String ticker);

    Flux<Stock> getStocksInList();
}
