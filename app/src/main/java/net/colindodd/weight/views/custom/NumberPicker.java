package net.colindodd.weight.views.custom;

import android.content.Context;
import android.util.AttributeSet;

import net.colindodd.weight.R;

public class NumberPicker extends com.shawnlin.numberpicker.NumberPicker {
    public NumberPicker(Context context) {
        super(context);
    }

    public NumberPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NumberPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public int getSolidColor() {
        return this.getResources().getColor(R.color.windowBackground);
    }
}
