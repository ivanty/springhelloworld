package com.xue.el;

import org.springframework.beans.factory.annotation.Value;

public class DemoService {


    @Value("其他类的属性")
    private String another;

    public String getAnther() {
        return another;
    }

    public void setAnther(String anther) {
        this.another = anther;
    }
}
