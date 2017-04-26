package net.colindodd.weight.views;

import android.content.Context;
import android.view.View;

import com.robinhood.spark.SparkView;
import com.shawnlin.numberpicker.NumberPicker;
import com.wealthfront.magellan.BaseScreenView;

import net.colindodd.weight.R;
import net.colindodd.weight.adapter.ReadingAdapter;
import net.colindodd.weight.model.Reading;
import net.colindodd.weight.screens.HomeScreen;

import java.util.List;

public class HomeView extends BaseScreenView<HomeScreen> {

    public HomeView(Context context) {
        super(context);
        inflate(getContext(), R.layout.screen_home, this);

        initView();
    }

    private void initView() {
        findViewById(R.id.add_reading).setOnClickListener(this.handleAddReadingClicked);
    }

    private final OnClickListener handleAddReadingClicked = new OnClickListener() {
        @Override
        public void onClick(View v) {
            final int kg = ((NumberPicker)findViewById(R.id.pick_kg)).getValue();
            final int g = ((NumberPicker)findViewById(R.id.pick_g)).getValue();
            getScreen().addReading(kg, g);
        }
    };

    public void renderReadings(final List<Reading> readings) {
        final ReadingAdapter adapter = new ReadingAdapter(readings);
        ((SparkView)findViewById(R.id.sparkview)).setAdapter(adapter);
    }
}
