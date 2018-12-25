package com.von.simple;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ： fjl
 * @date ： 2018/12/25/025 13:31
 */
@ConfigurationProperties(prefix = "example.service")
public class StartServiceProperties {

    private String config;

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
