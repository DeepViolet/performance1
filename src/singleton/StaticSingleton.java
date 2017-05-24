package singleton;

/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class StaticSingleton {
    private StaticSingleton(){
        System.out.println("singleton.Singleton is create");
    }
    private static class SingleTonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }
    public static StaticSingleton getInstance()
    {
        return SingleTonHolder.instance;
    }
    public static void createString(){
        System.out.println("create string in singleton.Singleton");
    }
}
