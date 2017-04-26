package net.colindodd.weight.screens;

import android.content.Context;

import com.wealthfront.magellan.Screen;

import net.colindodd.weight.views.HomeView;

public class HomeScreen extends Screen<HomeView> {
    @Override
    protected HomeView createView(Context context) {
        return new HomeView(context);
    }
}
