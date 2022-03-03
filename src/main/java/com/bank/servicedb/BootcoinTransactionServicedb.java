package com.bank.servicedb;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.bank.entity.BootcoinTransaction;
import com.bank.repository.BootcoinTransactionRepository;
import com.bank.service.IBootcoinTransactionService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class BootcoinTransactionServicedb implements IBootcoinTransactionService{

	private final BootcoinTransactionRepository repoBootcoinRepository;
	
	@Override
	public Mono<BootcoinTransaction> findById(String id) {
		// TODO Auto-generated method stub
		return repoBootcoinRepository.findById(id);
	}

	@Override
	public Flux<BootcoinTransaction> findAll() {
		// TODO Auto-generated method stub
		return repoBootcoinRepository.findAll();
	}

	@Override
	public Mono<BootcoinTransaction> create(BootcoinTransaction bootcoinTransaction) {
		// TODO Auto-generated method stub
		return repoBootcoinRepository.save(bootcoinTransaction);
	}

	@Override
	public Mono<BootcoinTransaction> update(String id, BootcoinTransaction bootcoinTransaction) {
		// TODO Auto-generated method stub
		return repoBootcoinRepository.findById(id).flatMap(e->{
			bootcoinTransaction.setId(e.getId());
			return repoBootcoinRepository.save(bootcoinTransaction);
		});
	}
	
	@KafkaListener(topics = "transfer")
	public void consumeMessage(BootcoinTransaction bootcoinTransaction) {
		System.out.println("Transfwrrrrrrrrrrrrrrrrrrrr");
		System.out.println("Transfwrrrrrrrrrrrrrrrrrrrr");
		System.out.println("Transfwrrrrrrrrrrrrrrrrrrrr");
		System.out.println("Transfwrrrrrrrrrrrrrrrrrrrr");
		System.out.println("Transfwrrrrrrrrrrrrrrrrrrrr");
		create(bootcoinTransaction).subscribe();
		
	}
}
