package com.bhavya.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "currency-service")  //  configuring currency-service as a prefix for all the properties of the class
@Component  // We want Spring to Manage this
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
