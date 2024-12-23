package com.payment_openfeign.controller;

import com.payment_openfeign.models.Payment;
import com.payment_openfeign.proxy.PaymentProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentController {
    private static Logger logger = Logger.getLogger(PaymentController.class.getName());
    private final PaymentProxy paymentProxy;

    public PaymentController(PaymentProxy paymentProxy) {
        this.paymentProxy = paymentProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        String requestId = UUID.randomUUID().toString();
        logger.info("Akses Ke project payment-openfeign");
        return paymentProxy.createPayment(requestId, payment);
    }
}
