/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }
    private static Singleton instance = null;
    public static synchronized Singleton getInstance(){
        if(null == instance)
            instance = new Singleton();
        return instance;
    }
    public static void createString(){
        System.out.println("create string in Singleton");
    }
}
