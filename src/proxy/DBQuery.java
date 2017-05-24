package proxy;

/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class DBQuery implements IDBquery {
    public DBQuery() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String reqest() {
        return "request string";
    }
}
