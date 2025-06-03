package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    @Value("${stripe.timeout:3000}")//default timeout 3000 in case there are no definition in application,properties
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> currency;

    @Override
    public void processPayment(double amount){
        System. out.println ("STRIPE");
        System.out.println ("API URL: " + apiUrl);
        System.out.println ("Enabled: " + enabled);
        System.out.println ("Timeout: " + timeout);
        System.out.println ("Currencies: " + currency);
        System. out.println ("Amount: " + amount);
    }
}
