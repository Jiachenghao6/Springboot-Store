package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component is a more general component
//@Service
public class Oderservice {
    private PaymentService paymentService;

    //@Autowired when there are multiple constructor of this class
    public Oderservice( PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOder(){
        var paymentService = this.paymentService;
        paymentService.processPayment(10);
    }


}
