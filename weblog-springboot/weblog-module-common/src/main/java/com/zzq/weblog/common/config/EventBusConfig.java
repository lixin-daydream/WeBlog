package com.zzq.weblog.common.config;

import com.google.common.eventbus.EventBus;
import com.zzq.weblog.common.eventbus.EventListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 张志强
 * @url: 
 * @date: 2023-07-01 21:42
 * @description: TODO
 **/
@Configuration
public class EventBusConfig {

    @Autowired
    private EventListener eventListener;

    @Bean
    public EventBus eventBus() {
        EventBus eventBus = new EventBus();
        eventBus.register(eventListener);
        return eventBus;
    }

}
