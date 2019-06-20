package cn.guangboyuan.singleton.sample;

/**
 * 描述：双重校验模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo5 {
    /**
     * volatile 防止指令重排序  内存可见
     */
    private volatile static SingletonDemo5 instance;

    private SingletonDemo5() {
    }

    /**
     * 双重检验
     *
     * @return 单例实例对象
     */
    public static SingletonDemo5 getInstance() {
        if (null == instance) {
            synchronized (SingletonDemo5.class) {
                if (null == instance) {
                    instance = new SingletonDemo5();
                }
            }
        }
        return instance;
    }
}
