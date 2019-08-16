package com.cpbalance.cpbalancebackend.payment;

import lombok.Data;

@Data
public class PaymentTO {
    private Long personId;
    private String value;
    private String desc;
    private String date;
}
