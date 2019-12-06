package com.example.widgetex;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widgetex1);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("월요일입니다");
                tv1.setTextSize(150);
                tv1.setTextColor(Color.RED);
                //tv1.setTextColor(Color.rgb(255,0,0));;
            }
        });
    }
}
