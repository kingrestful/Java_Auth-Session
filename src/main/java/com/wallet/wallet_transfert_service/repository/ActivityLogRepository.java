package com.wallet.wallet_transfert_service.repository;

import com.wallet.wallet_transfert_service.model.ActivityLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActivityLogRepository extends JpaRepository<ActivityLog, Long> {
    List<ActivityLog> findByUserIdOrderByTimestampDesc(Long userId);
}
