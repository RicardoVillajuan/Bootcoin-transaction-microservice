package com.bank.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "bootcointransaction")
public class BootcoinTransaction {
	
	@Id
	private String id;
	private String idbootcoin;
	private String paymentmethod;//Yanki
	private String typetransaction;//copmrando, vendiendo
	private String typebalance;
	private Double ammount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime creationdate;
	
}