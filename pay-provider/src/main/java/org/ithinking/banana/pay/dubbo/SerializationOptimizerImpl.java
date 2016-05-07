package org.ithinking.banana.pay.dubbo;

import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * ${TITLE}
 *
 * @author agan
 * @date 2016-05-07
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {

    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        /**
        classes.add(BidRequest.class);
        classes.add(BidResponse.class);
        classes.add(Device.class);
        classes.add(Geo.class);
        classes.add(Impression.class);
        classes.add(SeatBid.class);
        classes.add(User.class);
         **/
        return classes;
    }
}
