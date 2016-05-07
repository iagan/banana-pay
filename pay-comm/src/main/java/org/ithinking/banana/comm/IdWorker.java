package org.ithinking.banana.comm;

import java.util.Random;

/**
 * ID生成器
 *
 * @author agan
 * @date 2016-05-07
 */
public class IdWorker {

    public long nextId(){
        return new Random().nextLong();
    }
}
