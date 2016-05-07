package org.ithinking.banana.comm;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.List;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public class BeanMapper {

    private static final MapperFactory factory;
    private static final MapperFacade mapper;

    static {
        //创建mapper的工厂类
        factory = new DefaultMapperFactory.Builder().build();
        /**
         //注册一个mapper,这段可以通过过继承configurableMapper类，配置成spring bean
         factory.registerClassMap(factory.classMap(SourceObj.class, DescObj.class)
         //设置正向空值不复制，反向空值不复制
         .mapNulls(false).mapNullsInReverse(false)
         //相同的字段不需要显示声明
         //.field("prop1", "prop1")
         .field("intProp2", "prop2")
         //List, Array, Map类型的复制方式
         .field("listProp3{}", "prop3{}").mapNulls(true)
         .byDefault().toClassMap());
         **/
        //获取mapper
        mapper = factory.getMapperFacade();

    }

    public static <T> T copyTo(Object source, Class<T> target) {

        return mapper.map(source, target);
    }

    public static <T> List<T> copyListTo(List<?> source, Class<T> target) {
        return mapper.mapAsList(source, target);
    }
}
