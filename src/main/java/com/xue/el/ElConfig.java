package com.xue.el;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


import javax.annotation.Resource;


@Configuration
@ComponentScan("com.xue.el")

public class ElConfig {

     @Value("I love you")
    private String normal;

    @Value("#{systemProperties['os.name']}")
    private String osname;

    @Value("{T(java.lang.Math).random()* 100.0}")
    private double randomname;

    @Value("#{demoService.anothor}")
    private String formAnothor;

    private Resource testFile;

   @Value("${book.name}")
    private  String bookname;

   @Autowired
    private Environment environment;


   @Bean
  public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
           return new PropertySourcesPlaceholderConfigurer();
  }

  public void outputResource(){

      System.out.println(normal);

  }

}
