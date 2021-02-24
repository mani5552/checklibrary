package com.nibunar.checkintent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class verification2 extends Activity {

    LinearLayout linear1,linear2,linear3,linear1_1,linear1_2,linear1_3;
    RadioButton sim1_radio,sim2_radio;
    Button send;
    TextView info,status_verification;
    ImageView image1,image2,image3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verificationstep_layout);

        linear1 = findViewById(R.id.linear1);
        linear2 = findViewById(R.id.linear2);
        linear3 = findViewById(R.id.linear3);
        linear1_1 = findViewById(R.id.linear1_1);
        linear1_2 = findViewById(R.id.linear1_2);
        linear1_3 = findViewById(R.id.linear1_3);
        sim2_radio = findViewById(R.id.sim2_radio);
        sim1_radio = findViewById(R.id.sim1_radio);
        send = findViewById(R.id.send);
        info = findViewById(R.id.info);
        status_verification = findViewById(R.id.status_verification);
        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);

        linear1.setVisibility(View.VISIBLE);
        linear2.setVisibility(View.GONE);
        linear3.setVisibility(View.GONE);

        sim1_radio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    linear1.setVisibility(View.GONE);
                    linear2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.VISIBLE);

                }
            }
        });

        sim2_radio.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    linear1.setVisibility(View.GONE);
                    linear2.setVisibility(View.VISIBLE);
                    image1.setVisibility(View.VISIBLE);
                }
            }
        });

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linear2.setVisibility(View.GONE);
                linear3.setVisibility(View.VISIBLE);
                image2.setVisibility(View.VISIBLE);
            }
        });

    }
}
