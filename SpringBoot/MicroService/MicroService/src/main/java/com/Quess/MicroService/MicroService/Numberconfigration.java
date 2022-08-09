package com.Quess.MicroService.MicroService;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstmicroserviceapp")
public class Numberconfigration {
    public Numberconfigration() {
    }
    private float max;
    private float min;

    public float getMax() {
        return max;
    }

    public void setMax(float max) {
        this.max = max;
    }

    public float getMin() {
        return min;
    }

    public void setMin(float min) {
        this.min = min;
    }

    public Numberconfigration(float max, float min) {
        this.max = max;
        this.min = min;
    }
}
