package com.wallet.wallet_transfert_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {

    @GetMapping("/")
    public String home() {
        return "Wallet Transfer Service is running ✅";
    }
}
