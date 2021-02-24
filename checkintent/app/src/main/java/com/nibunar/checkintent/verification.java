package com.nibunar.checkintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class verification extends Activity {

    Button verifysim;
    LinearLayout linear_failure,linear_sucess,progress_linear,first_linear;
    Button verify_failure,verify_success;
    TextView verifysim2text;

    Button verifysimbottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobileverification);

        verifysim = findViewById(R.id.verifysim);


        verifysim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomview();
            }
        });

        // ATTENTION: This was auto-generated to handle app links.
        Intent appLinkIntent = getIntent();
        String appLinkAction = appLinkIntent.getAction();
        Uri appLinkData = appLinkIntent.getData();
        handleIntent(getIntent());
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        String appLinkAction = intent.getAction();
        Uri appLinkData = intent.getData();
        if (Intent.ACTION_VIEW.equals(appLinkAction) && appLinkData != null){
            String recipeId = appLinkData.getLastPathSegment();
            Uri appData = Uri.parse("content://com.nibunar.checkintent/verification/").buildUpon()
                    .appendPath(recipeId).build();
            //showRecipe(appData);
        }
    }

    public void bottomview(){

        BottomSheetDialog sim = new BottomSheetDialog(this);
        sim.setContentView(R.layout.bottomsheet_verifysim);
        sim.setCanceledOnTouchOutside(false);


        ImageView closebottom = (ImageView) sim.findViewById(R.id.closebottom);
        verifysimbottom = (Button) sim.findViewById(R.id.verifysim);
        verifysim2text = (TextView) sim.findViewById(R.id.verifysim2text);
        TextView verifysim1text = (TextView) sim.findViewById(R.id.verifysim1text);
        progress_linear = (LinearLayout) sim.findViewById(R.id.progress_linear);
        linear_failure = (LinearLayout) sim.findViewById(R.id.linear_failure);
        linear_sucess = (LinearLayout) sim.findViewById(R.id.linear_sucess);
        first_linear = (LinearLayout) sim.findViewById(R.id.first_linear);
        verify_failure = (Button) sim.findViewById(R.id.verify_failure);
        verify_success = (Button) sim.findViewById(R.id.verify_success);
        TextView status_verification = (TextView) sim.findViewById(R.id.status_verification);
        TextView info = (TextView) sim.findViewById(R.id.info);

        closebottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sim.dismiss();
            }
        });

        verify_failure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress_linear.setVisibility(View.VISIBLE);
                first_linear.setVisibility(View.GONE);
                linear_failure.setVisibility(View.GONE);
                linear_sucess.setVisibility(View.GONE);
            }
        });


        verifysimbottom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                sendsms();
                progress_linear.setVisibility(View.VISIBLE);
                first_linear.setVisibility(View.GONE);
                linear_failure.setVisibility(View.GONE);
                linear_sucess.setVisibility(View.GONE);

                status_verification.setText("waiting for your sms");

                final Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        status_verification.setText("we Received your sms,we will send an sms to you.");
                        info.setVisibility(View.VISIBLE);
                    }
                },5000);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        progress_linear.setVisibility(View.GONE);
                        first_linear.setVisibility(View.GONE);
                        linear_failure.setVisibility(View.GONE);
                        linear_sucess.setVisibility(View.VISIBLE);
                        info.setVisibility(View.GONE);
                    }
                },10000);
            }

        });


        sim.show();
    }


    public void sendsms(){

        progress_linear.setVisibility(View.GONE);
        first_linear.setVisibility(View.GONE);
        linear_failure.setVisibility(View.GONE);
        linear_sucess.setVisibility(View.GONE);
        Uri uri = Uri.parse("smsto:+919220592205");
        Intent it = new Intent(Intent.ACTION_SENDTO, uri);
        it.putExtra("sms_body", "MEYQY This to verify you for Nibunar bussiness Solution ");
        startActivity(it);
    }
}
