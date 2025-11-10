package com.wallet.wallet_transfert_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.wallet.wallet_transfert_service")
public class WalletTransfertServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletTransfertServiceApplication.class, args);
	}
}
