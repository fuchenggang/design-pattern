package cn.guangboyuan.singleton.sample;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 描述：注册表方式实现单例模式（线程安全,Spring框架通过这中方式实现单例）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo8 {
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<>(32);

    static {
        SingletonDemo8 singletonDemo8 = new SingletonDemo8();
        singletonObjects.put(singletonDemo8.getClass().getName(), singletonDemo8);
    }

    private SingletonDemo8() {
    }

    public static SingletonDemo8 getInstance(String name) {
        if (null == singletonObjects.get(name)) {
            try {
                singletonObjects.put(name, Class.forName(name).newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (SingletonDemo8) singletonObjects.get(name);
    }
}
