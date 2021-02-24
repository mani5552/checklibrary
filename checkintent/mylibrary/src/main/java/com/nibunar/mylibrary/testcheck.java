package com.nibunar.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;

public class testcheck extends AppCompatCheckBox implements CompoundButton.OnCheckedChangeListener {


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


    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


        Log.e("check","fromlibrary");
        Toast.makeText(buttonView.getContext(), "check", Toast.LENGTH_SHORT).show();
    }
}
