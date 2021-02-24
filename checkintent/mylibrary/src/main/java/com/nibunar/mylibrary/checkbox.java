package com.nibunar.mylibrary;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends Activity {

    static CheckBox checkbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);

    }

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

        checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("toast","from library");
                Toast.makeText(c,"checked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
