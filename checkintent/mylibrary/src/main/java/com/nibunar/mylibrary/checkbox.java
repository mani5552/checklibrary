package com.nibunar.mylibrary;


import android.content.Context;
import android.widget.Toast;

public class checkbox  {

   static CheckBox checkbox;

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();
checkbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e("toast","from lib");
                Toast.makeText(c,"checked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
