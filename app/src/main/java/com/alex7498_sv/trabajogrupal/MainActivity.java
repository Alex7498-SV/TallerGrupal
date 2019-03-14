package com.alex7498_sv.trabajogrupal;


//Integrantes:
//Sharp Reyes Joshua Steven 00159817
// Solorzano Chicas Victor Ernesto 00198117
//Siguenza Argueta Ruben Alexander 00068817

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number = 0;
    int number2 = 0;
    private Button b1;
    private TextView TV1;
    private Button b2;
    private TextView TV2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        TV1 = findViewById(R.id.tv1);

        b2 = findViewById(R.id.b2);
        TV2 = findViewById(R.id.tv2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number = number + 1;

                TV1.setText(Integer.toString(number));

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number2 = number2 + 1;

                TV2.setText(Integer.toString(number2));


            }
        });
    }

}
