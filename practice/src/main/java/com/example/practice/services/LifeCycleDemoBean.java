package com.example.practice.services;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean(){
        System.out.println("## I'm in the LifeCycleBean Constructor");
    }
    @Override
    public void destroy() throws Exception{
        System.out.println("##The lifecycle bean has been terminated");
    }
    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("##The LifeCycleBean has its properties set");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException{
        System.out.println("## Bean Factory has been set");
    }
    @Override
    public void setBeanName(String name)
    {
        System.out.println("## My bean name is: " + name);
    }
    public void setApplicationContext(ApplicationContext applicationContext) throws  BeansException{
        System.out.println("##Application context has been set");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("##The post construc annotated method has been called");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("##The predestroy annotated method has been called");
    }
    public void beforeInit(){
        System.out.println("##-BEFORE INIT- Called by bean Post Processor");
    }
    public void afterInit(){
        System.out.println("##-AFTER INIT- Called by bean Post Processor");
    }

}
