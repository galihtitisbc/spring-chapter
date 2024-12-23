package com.example.demo.service;

import com.example.demo.exception.NotEnoughMoneyException;
import com.example.demo.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails paymentProcess() {
        throw new NotEnoughMoneyException("--");
    }
}
