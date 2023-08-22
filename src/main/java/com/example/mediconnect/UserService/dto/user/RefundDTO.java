package com.example.mediconnect.UserService.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RefundDTO {
    private  UUID userId;
    private  double amount;


}
