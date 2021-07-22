package com.example.app12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_toURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_toURL=(Button)findViewById(R.id.button);
        btn_toURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //setting implicit Uri intent
                Intent to_Third=new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.co.in"));
                startActivity(to_Third);
            }
        });
    }
}
