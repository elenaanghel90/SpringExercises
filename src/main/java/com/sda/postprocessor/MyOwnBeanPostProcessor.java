package com.sda.postprocessor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyOwnBeanPostProcessor implements BeanPostProcessor {
    public static final Log LOGGER = LogFactory.getLog(MyOwnBeanPostProcessor.class);

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
         LOGGER.info("Before initialization " + beanName);
         return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        LOGGER.info("After initialization " + beanName);
        return bean;
    }
}
