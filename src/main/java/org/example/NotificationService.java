package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
@EnableFeignClients
public class NotificationService {

    @Autowired
    MailService mailService;
    public static void main(String[] args) {
        SpringApplication.run(NotificationService.class,args);
    }

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(AccountPlacedEvent accountPlacedEvent){
        log.info("Topic Revcied");
    }
}
