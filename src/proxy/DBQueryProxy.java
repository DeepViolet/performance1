package proxy;

/**
 * Created by liuhuiyi on 2017/5/24.
 */
public class DBQueryProxy implements IDBquery {
    private DBQuery real = null;

    @Override
    public String reqest() {
        if(real == null)
            real = new DBQuery();
        return real.reqest();
    }
}
