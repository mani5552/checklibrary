package com.nibunar.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class testlinear extends LinearLayout {
    Context context;
    CheckBox thisisidcheck;
    TextView txt_id;
    public testlinear(Context context, AttributeSet attrs) {
        super(context,attrs);
        init();
    }



    private void init() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.mylayout, this, true);
        thisisidcheck = (CheckBox) v.findViewById(R.id.thisisidcheck);
        txt_id = (TextView) v.findViewById(R.id.txt_id);

        thisisidcheck.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Log.e("checkbox","true");
                    txt_id.setText("Your Id id Awake");
                }else {
                    Log.e("checkbox","false");
                    txt_id.setText("This is my id");
                }
            }
        });
    }






}
