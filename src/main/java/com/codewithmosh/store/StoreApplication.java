package com.codewithmosh.store;

import org.apache.catalina.Manager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        // 1. start Spring Boot and return an ApplicationContext（IoC container）
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        // 2. 从容器里取出已经由 Spring 管理的 Oderservice Bean
        var oderservice =context.getBean(Oderservice.class);

       // var oderservice = new Oderservice(new PaypalPaymentService());
        oderservice.placeOder();

        var manager=context.getBean(NotificationManager.class);
        manager.sendNotification("Hello World");
    }

}
