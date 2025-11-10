<<<<<<< HEAD
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
=======
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
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
