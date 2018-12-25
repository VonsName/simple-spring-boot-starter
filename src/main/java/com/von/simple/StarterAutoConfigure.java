package com.von.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ： fjl
 * @date ： 2018/12/25/025 13:33
 */
@Configuration
@ConditionalOnClass(StarterService.class)
@EnableConfigurationProperties(StartServiceProperties.class)
public class StarterAutoConfigure {

    @Autowired
    private StartServiceProperties properties;

    @Bean
    @ConditionalOnMissingBean
    public StarterService starterService() {
        return new StarterService(properties.getConfig());
    }
}
