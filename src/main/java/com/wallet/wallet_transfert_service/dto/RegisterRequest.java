package com.wallet.wallet_transfert_service.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String fullName;
    private String password;
}
