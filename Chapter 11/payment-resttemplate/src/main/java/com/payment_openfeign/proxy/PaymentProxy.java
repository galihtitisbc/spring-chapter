package com.payment_openfeign.proxy;

import com.payment_openfeign.models.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
public class PaymentProxy {
    private final RestTemplate restTemplate;

    @Value("${server_url}")
    private String url;

    public PaymentProxy(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Payment payment(Payment payment) {
        String url = this.url + "/payment";
        HttpHeaders headers = new HttpHeaders();
        headers.add("requestId", UUID.randomUUID().toString());
        HttpEntity<Payment> http = new HttpEntity<>(payment, headers);
        ResponseEntity<Payment> response = restTemplate.exchange(url,
                HttpMethod.POST,
                http,
                Payment.class
        );
        return response.getBody();
    }
}
