package net.colindodd.weight.adapter;

import com.robinhood.spark.SparkAdapter;

import net.colindodd.weight.model.Reading;

import java.util.List;

public class ReadingAdapter extends SparkAdapter {

    private List<Reading> readings;

    public ReadingAdapter(final List<Reading> readings) {
        this.readings = readings;
    }

    @Override
    public int getCount() {
        return this.readings.size();
    }

    @Override
    public Object getItem(final int index) {
        return this.readings.get(index);
    }

    @Override
    public float getY(int index) {
        final Reading reading = this.readings.get(index);
        return reading.getWeight().getInGrams();
    }
}
