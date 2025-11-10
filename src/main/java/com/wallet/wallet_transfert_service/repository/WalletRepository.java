<<<<<<< HEAD
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findByUserId(Long userId);
}
=======
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findByUserId(Long userId);
}
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
