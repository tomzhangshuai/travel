package com.jt.sys.schule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Configurable
@EnableScheduling
public class SchuelConfig {

    @Scheduled(cron ="0 0/1 * * * ?")
    public void f(){
        System.out.println("我的测试***********************我的测试********************************");
    }
}
