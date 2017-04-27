package net.colindodd.weight.screens;

import android.content.Context;

import com.wealthfront.magellan.Screen;

import net.colindodd.weight.Application;
import net.colindodd.weight.model.DaoSession;
import net.colindodd.weight.model.Reading;
import net.colindodd.weight.model.ReadingDao;
import net.colindodd.weight.model.Weight;
import net.colindodd.weight.model.WeightDao;
import net.colindodd.weight.views.HomeView;

import org.greenrobot.greendao.query.Query;

import java.util.List;

public class HomeScreen extends Screen<HomeView> {

    private ReadingDao readingDao;
    private WeightDao weightDao;

    @Override
    protected HomeView createView(Context context) {
        initDb();
        final HomeView view = new HomeView(context);
        view.renderReadings(getReadings());
        return view;
    }

    private void initDb() {
        final DaoSession daoSession = ((Application) getActivity().getApplication()).getDaoSession();
        this.readingDao = daoSession.getReadingDao();
        this.weightDao = daoSession.getWeightDao();
    }

    public void addReading(final int kg, final int g) {
        final Weight weight = new Weight();
        weight.setKg(kg);
        weight.setG(g);
        weightDao.insert(weight);

        final Reading reading = new Reading().generateTimestamp();
        reading.setWeight(weight);
        readingDao.insertOrReplace(reading);

        getView().renderReadings(getReadings());
    }

    private List<Reading> getReadings() {
        final Query readingsQuery =
                this.readingDao
                .queryBuilder()
                .orderAsc(ReadingDao.Properties.Timestamp)
                .build();
        return readingsQuery.list();
    }
}
