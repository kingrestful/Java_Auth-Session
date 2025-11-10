<<<<<<< HEAD
package com.wallet.wallet_transfert_service.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    private User user;
}
=======
package com.wallet.wallet_transfert_service.model;


import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    private User user;
}
>>>>>>> 1497d37f3a77630e27910898a055813197bb13be
