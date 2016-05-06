package org.ithinking.banana.pay.conf;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.ithinking.banana.pay.Constant;
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
    /**
    <!-- 公共信息，也可以用dubbo.properties配置 -->
    <dubbo:application name="annotation-provider" />
     <!-- 注册中心(zookeeper) -->
    <dubbo:registry address="127.0.0.1:4548" />
    <!-- 扫描注解包路径，多个包用逗号分隔，不填pacakge表示扫描当前ApplicationContext中所有的类 -->
    <dubbo:annotation package="com.foo.bar.service" />
     **/

    public static final String APPLICATION_NAME = "banana-pay-provider";
    public static final String REGISTRY_ADDRESS = "zookeeper://127.0.0.1:2181";
    public static final String ANNOTATION_PACKAGE = "org.ithinking.banana.pay.service.remote.impl";

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(APPLICATION_NAME);
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setId(Constant.DUBBO_REGISTRY);
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
