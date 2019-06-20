package cn.guangboyuan.singleton.sample;

/**
 * 描述：懒汉模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * 方法上加锁，锁的范围比较大，效率低
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance;

    private SingletonDemo1() {
    }

    public static synchronized SingletonDemo1 getInstance() {
        if (null == instance) {
            instance = new SingletonDemo1();
        }

        return instance;
    }
}
