package com.example.yona.name;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Intent switch_1 = new Intent(MainActivity.this, SecondActivity.class);

        Button Button_1 = (Button) findViewById(R.id.button_1);

        Button_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(switch_1);
            }
        });
    }




    }

