package com.example.demo.payments.billing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    private UUID billId;
    private BillStatus billStatus;
    private Float billAmount;
    private Date billDate;
    private Date billDueDate;
    private Date billPaidDate;
    private Float billPaidAmount;
    private boolean billPaidStatus;
    private BillPaidMethod billPaidMethod;
    private String billPaidReference;

    // constructor, getters, and setters
}
