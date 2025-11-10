<<<<<<< HEAD
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Token;
import com.wallet.wallet_transfert_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    List<Token> findAllByUserAndExpiredFalseAndRevokedFalse(User user);

    Optional<Token> findByToken(String token);
}
=======
package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.Token;
import com.wallet.wallet_transfert_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Long> {

    List<Token> findAllByUserAndExpiredFalseAndRevokedFalse(User user);

    Optional<Token> findByToken(String token);
}
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
