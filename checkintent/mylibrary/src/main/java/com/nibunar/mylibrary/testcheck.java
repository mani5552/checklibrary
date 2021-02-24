package com.nibunar.mylibrary;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;

public class testcheck extends AppCompatCheckBox {


    public testcheck(@NonNull Context context) {
        super(context);
    }

    public testcheck(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public testcheck(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean performClick() {
        return super.performClick();
    }


}
