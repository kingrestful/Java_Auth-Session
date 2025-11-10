<<<<<<< HEAD
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
=======
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
