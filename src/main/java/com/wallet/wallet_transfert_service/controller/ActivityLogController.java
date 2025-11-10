package com.wallet.wallet_transfert_service.controller;



import com.wallet.wallet_transfert_service.model.ActivityLog;
import com.wallet.wallet_transfert_service.repository.ActivityLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class ActivityLogController {

    @Autowired ActivityLogRepository repo;

    @GetMapping("/{userId}")
    public List<ActivityLog> getLogs(@PathVariable Long userId) {
        return repo.findByUserIdOrderByTimestampDesc(userId);
    }
}
