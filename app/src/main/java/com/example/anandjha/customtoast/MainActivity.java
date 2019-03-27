package com.example.anandjha.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void redPressed(View v){
            Toast.makeText(this, "ok",Toast.LENGTH_SHORT).show();
            showCustomToast("Customized toast");


    }
    public void showCustomToast(String str){
        LayoutInflater inflater=getLayoutInflater();
        View layout=inflater.inflate(R.layout.toast_laypot,(ViewGroup) findViewById(R.id.toast_root));
        TextView toastText=layout.findViewById(R.id.toast_text);
        toastText.setText(str);

        Toast toast=new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
