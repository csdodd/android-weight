package net.colindodd.weight.views;

import android.content.Context;

import com.wealthfront.magellan.BaseScreenView;

import net.colindodd.weight.R;
import net.colindodd.weight.screens.HomeScreen;

public class HomeView extends BaseScreenView<HomeScreen> {

    public HomeView(Context context) {
        super(context);
        inflate(getContext(), R.layout.screen_home, this);
    }
}
