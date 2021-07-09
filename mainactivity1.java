package com.example.app11;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Intent Myintent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Myintent =new Intent(MainActivity.this,MainActivity2.class);
                Myintent.putExtra("value1","hello!!");
                startActivity(Myintent);
            }
        });
    }
}
