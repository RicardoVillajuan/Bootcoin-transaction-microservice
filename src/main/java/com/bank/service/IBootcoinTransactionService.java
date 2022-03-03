package com.bank.service;

import com.bank.entity.BootcoinTransaction;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IBootcoinTransactionService {
	
	Mono<BootcoinTransaction> findById(String id);
	
	Flux<BootcoinTransaction> findAll();
	
	Mono<BootcoinTransaction> create(BootcoinTransaction bootcoinTransaction);
	
	Mono<BootcoinTransaction> update(String id,BootcoinTransaction bootcoinTransaction);
}
