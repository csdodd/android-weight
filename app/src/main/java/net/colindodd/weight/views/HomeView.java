package net.colindodd.weight.views;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import com.shawnlin.numberpicker.NumberPicker;
import com.wealthfront.magellan.BaseScreenView;

import net.colindodd.weight.R;
import net.colindodd.weight.screens.HomeScreen;

public class HomeView extends BaseScreenView<HomeScreen> {

    public HomeView(Context context) {
        super(context);
        inflate(getContext(), R.layout.screen_home, this);

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
}
