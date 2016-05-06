package org.ithinking.banana.pay.conf;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * DubboConfig
 *
 * @author agan
 * @date 2016-05-07
 */
@Configuration
public class DubboConfig {
    public static final String APPLICATION_NAME = "banana-pay-interface";
    public static final String REGISTRY_ADDRESS = "zookeeper://127.0.0.1:2181";
    public static final String ANNOTATION_PACKAGE = "com.alibaba.dubbo.demo.consumer";

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATION_NAME);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(REGISTRY_ADDRESS);
        return registryConfig;
    }

    @Bean
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        annotationBean.setPackage(ANNOTATION_PACKAGE);
        return annotationBean;
    }
}
