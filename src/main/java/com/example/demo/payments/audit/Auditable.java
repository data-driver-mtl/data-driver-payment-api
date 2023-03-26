package com.example.demo.payments.audit;

import java.time.LocalDateTime;

public interface Auditable {
    default LocalDateTime getCreatedBy(){
        return LocalDateTime.now();
    }
    LocalDateTime getUpdatedBy();
    void setUpdatedBy(String updatedBy);
}
