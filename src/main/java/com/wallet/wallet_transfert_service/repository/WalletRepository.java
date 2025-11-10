package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Wallet findByUserId(Long userId);
}
