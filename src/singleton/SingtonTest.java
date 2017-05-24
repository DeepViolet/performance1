package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class SingtonTest extends Thread {
    public static class AccessSingletonThread extends Thread {
        long begintime;

        public AccessSingletonThread(long begintime) {
            this.begintime = begintime;
        }

        @Override
        public void run() {
            System.out.println("try to get instance");
            for (int i = 0; i < 100000; i++)
                //singleton.Singleton.getInstance();
                Singleton.getInstance();
            System.out.println("spend:" + (System.currentTimeMillis() - begintime));
        }
    }

    //@Test
    public static void testPerformance() throws InterruptedException {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        long begintime = System.currentTimeMillis();
        exe.submit(new AccessSingletonThread(begintime));
        exe.submit(new AccessSingletonThread(begintime));
        exe.submit(new AccessSingletonThread(begintime));
        exe.submit(new AccessSingletonThread(begintime));
        exe.submit(new AccessSingletonThread(begintime));

        Thread.sleep(10000);
    }

    public static void testSingleton() {
        StaticSingleton.createString();
       // singleton.StaticSingleton.getInstance();
    }
}
