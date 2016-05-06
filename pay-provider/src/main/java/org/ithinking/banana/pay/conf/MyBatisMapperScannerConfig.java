package org.ithinking.banana.pay.conf;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis扫描接口
 *  通用Mapper : tk.mybatis.spring.mapper.MapperScannerConfigurer
 *  MyBatis Mapper : org.mybatis.spring.mapper.MapperScannerConfigurer
 * @author agan
 * @since 2016-04-28
 */
@Configuration
//TODO 注意，由于MapperScannerConfigurer执行的比较早，所以必须有下面的注解
@AutoConfigureAfter(MyBatisConfig.class)
public class MyBatisMapperScannerConfig {

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("org.ithinking.banana.pay.mapper");
        //Properties properties = new Properties();
        //properties.setProperty("mappers", "tk.mybatis.springboot.util.MyMapper");
        //properties.setProperty("notEmpty", "false");
        //properties.setProperty("IDENTITY", "MYSQL");
        //mapperScannerConfigurer.setProperties(properties);
        //mapperScannerConfigurer.setNameGenerator();
        return mapperScannerConfigurer;
    }

}
