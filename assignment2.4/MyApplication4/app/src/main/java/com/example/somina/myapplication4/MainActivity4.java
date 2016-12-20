package com.example.somina.myapplication4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private boolean flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        textView= (TextView) findViewById(R.id.android);
        button= (Button) findViewById(R.id.button);
        flag=true;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    textView.setVisibility(View.INVISIBLE);
                    flag = false;
                    button.setText("Show");
                }else{
                    textView.setVisibility(View.VISIBLE);
                    flag=true;
                    button.setText("Hide");
                }

            }
        });

    }
}
