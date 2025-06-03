package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${paymentGateway}")
    private String paymentGateway;
    @Bean
    public PaymentService stripe() {
        return new StripePaymentService();
    }

    @Bean
    public PaymentService paypal() {
        return new PaypalPaymentService();
    }

    @Bean
    public Oderservice oderservice() {
        if (paymentGateway.equals("stripe")) {
            return new Oderservice(stripe());
        }
        return new Oderservice(paypal());
    }
}
