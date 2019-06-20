package cn.guangboyuan.singleton.sample;

/**
 * 描述：懒汉模式（线程不安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo {
    private static SingletonDemo instance;

    private SingletonDemo() {
    }

    /**
     * 多线程同时调用getInstance方法，单例类可能会被多次实例化
     *
     * @return 单例对象
     */
    public static SingletonDemo getInstance() {
        if (null == instance) {
            instance = new SingletonDemo();
        }
        return instance;
    }
}
