/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }
    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
    public static void createString(){
        System.out.println("create string in Singleton");
    }
}
