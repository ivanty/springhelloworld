package com.xue.el;

import org.springframework.beans.factory.annotation.Value;

public class DemoService {


    @Value("其他类的属性")
    private String anther;

    public String getAnther() {
        return anther;
    }

    public void setAnther(String anther) {
        this.anther = anther;
    }
}
