package proxy;

/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class Main {
    public static void main(String args[]){
        IDBquery q = new DBQueryProxy();
        System.out.println(q.reqest());
    }
}
