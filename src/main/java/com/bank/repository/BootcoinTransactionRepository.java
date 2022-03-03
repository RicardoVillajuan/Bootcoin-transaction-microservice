package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.entity.BootcoinTransaction;

public interface BootcoinTransactionRepository extends ReactiveMongoRepository<BootcoinTransaction, String>{

}
