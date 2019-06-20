package cn.guangboyuan.singleton.sample;

/**
 * 描述：饿汉模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * 比静态类多了内存常驻的功能，没有懒加载的效果
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance = new SingletonDemo2();

    private SingletonDemo2(){
    }

    public static SingletonDemo2 getInstance(){
        return instance;
    }
}
