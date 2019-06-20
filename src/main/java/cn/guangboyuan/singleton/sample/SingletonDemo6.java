package cn.guangboyuan.singleton.sample;

/**
 * 描述：线程级别单例模式（ThreadLocal线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo6 {
    private static final ThreadLocal<SingletonDemo6> tlSingleton = new ThreadLocal<SingletonDemo6>() {
        @Override
        protected SingletonDemo6 initialValue() {
            return new SingletonDemo6();
        }
    };

    private SingletonDemo6() {
    }

    public static SingletonDemo6 getInstance() {
        return tlSingleton.get();
    }
}
