package cn.guangboyuan.singleton.sample;

/**
 * 描述：静态内部类模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo3 {
    /**
     * 静态内部类不会再单例加载的时候就加载，而是在调用getInstance()方法时才会加载，类加载机制保证的线程安全
     */
    private static class SingletonHolder {
        private static SingletonDemo3 instance = new SingletonDemo3();
    }

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        return SingletonHolder.instance;
    }
}
