package com.example.challenge4;


import lombok.extern.apachecommons.CommonsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
public class test {

    Logger log = LoggerFactory.getLogger(test.class);
    @Scheduled(fixedRate = 1000)
    public  void count(){
        log.info(" Local Date Now Is   >> " + LocalDateTime.now());
    }
}
