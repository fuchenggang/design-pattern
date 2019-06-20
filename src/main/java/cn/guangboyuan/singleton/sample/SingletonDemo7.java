package cn.guangboyuan.singleton.sample;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 描述：CAS锁单例模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo7 {

    private static final AtomicReference<SingletonDemo7> INSTANCE = new AtomicReference<>();

    private SingletonDemo7(){
    }

    public static SingletonDemo7 getInstance(){
        for (;;){
            SingletonDemo7 current = INSTANCE.get();
            if(null != current){
                return current;
            }
            current = new SingletonDemo7();
            if(INSTANCE.compareAndSet(null,current)){
                return current;
            }
        }
    }
}
