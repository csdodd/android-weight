package net.colindodd.weight;

import net.colindodd.weight.model.DaoMaster;
import net.colindodd.weight.model.DaoSession;

import org.greenrobot.greendao.database.Database;

public class Application extends android.app.Application {

    private DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        final DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "db");
        final Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
