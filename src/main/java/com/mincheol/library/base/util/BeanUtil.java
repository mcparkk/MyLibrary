package com.mincheol.library.base.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BeanUtil {

    private static ApplicationContext applicationContext;

    @Autowired
    private void init(ApplicationContext applicationCtx) {
        applicationContext = applicationCtx;
    }

    private static ApplicationContext getContext() {
        return applicationContext;
    }

    public static <T> T getBean(Class<T> requiredType) {
        if (getContext() == null) {
            return null;
        }

        try {
            return getContext().getBean(requiredType);
        }
        catch (BeansException e) {
            log.warn("{}", e.getMessage());
            return null;
        }
    }

    public static <T> T getBean(String beanName, Class<T> requiredType) {
        if (getContext() == null) {
            return null;
        }

        try {
            return getContext().getBean(beanName, requiredType);
        }
        catch (BeansException e) {
            log.warn("{}", e.getMessage());
            return null;
        }
    }

    public static Object getBean(String beanName) {
        if (getContext() == null) {
            return null;
        }

        try {
            return getContext().getBean(beanName);
        }
        catch (BeansException e) {
            log.warn("{}", e.getMessage());
            return null;
        }
    }

    public static ObjectMapper objectMapper(){
        ObjectMapper objectMapper = getBean(ObjectMapper.class);
        if(objectMapper == null){
            objectMapper = new ObjectMapper();
        }
        return objectMapper;
    }
}
