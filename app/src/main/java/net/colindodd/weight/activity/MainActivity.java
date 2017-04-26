package net.colindodd.weight.activity;

import android.os.Bundle;

import com.wealthfront.magellan.Navigator;
import com.wealthfront.magellan.support.SingleActivity;

import net.colindodd.weight.R;
import net.colindodd.weight.screens.HomeScreen;

public class MainActivity extends SingleActivity {
    @Override
    protected Navigator createNavigator() {
        return Navigator.withRoot(new HomeScreen()).build();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
