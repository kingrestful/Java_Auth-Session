package com.wallet.wallet_transfert_service.dto;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String password;
}
