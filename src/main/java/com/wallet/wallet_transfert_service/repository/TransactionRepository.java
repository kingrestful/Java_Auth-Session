<<<<<<< HEAD
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserIdOrderByCreatedAtDesc(Long userId);
}
=======
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserIdOrderByCreatedAtDesc(Long userId);
}
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
