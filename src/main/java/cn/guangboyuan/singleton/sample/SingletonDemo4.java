package cn.guangboyuan.singleton.sample;

/**
 * 描述：枚举方式模式（线程安全）
 * 网站：http://guangboyuan.cn
 * 微信公众号：程序员之路（包含各种学习资源）
 *
 * @author RedAnts
 * @version 1.0
 */
public class SingletonDemo4 {
    public static void main(String[] args) {
        SingletonDemo4Enum.INSTANCE.otherMethods();
    }
}

enum SingletonDemo4Enum {
    /**
     * 单例枚举
     */
    INSTANCE;

    public void otherMethods() {
        System.out.println("Something");
    }

}
