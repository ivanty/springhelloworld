package com.xue.aware;


import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;



@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware {


    private String beanName;
    private ResourceLoader loader;


    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {

           this.loader=resourceLoader;

    }

    @Override
    public void setBeanName(String name) {
        this.beanName=name;
    }
}
