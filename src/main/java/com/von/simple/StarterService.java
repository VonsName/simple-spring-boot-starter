package com.von.simple;

/**
 * @author ： fjl
 * @date ： 2018/12/25/025 13:30
 */
public class StarterService {

    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String sep) {
        return config.split(sep);
    }
}
