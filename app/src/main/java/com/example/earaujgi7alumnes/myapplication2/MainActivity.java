package com.example.earaujgi7alumnes.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);
        Button b3 = (Button) findViewById(R.id.button3);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText4 = (EditText) findViewById(R.id.editText4);
                if(Double.valueOf(editText4.getText().toString()) == 1.06248) {
                    double divisa1 = Double.valueOf(editText.getText().toString());
                    double cambio = divisa1 * 1.06248;
                    String divisa2 = String.valueOf(cambio);
                    editText2.setText(divisa2);
                }else{
                    double divisa1 = Double.valueOf(editText.getText().toString());
                    double cambio = divisa1 * Double.valueOf(editText4.getText().toString());
                    String divisa2 = String.valueOf(cambio);
                    editText2.setText(divisa2);
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                EditText editText4 = (EditText) findViewById(R.id.editText4);
                if(Double.valueOf(editText4.getText().toString()) == 1.06248) {
                    double divisa1 = Double.valueOf(editText.getText().toString());
                    double cambio = divisa1 * 0.94119;
                    String divisa2 = String.valueOf(cambio);
                    editText2.setText(divisa2);
                }else{
                    double divisa1 = Double.valueOf(editText.getText().toString());
                    double cambio = divisa1 * Double.valueOf(editText4.getText().toString());
                    String divisa2 = String.valueOf(cambio);
                    editText2.setText(divisa2);
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView6);
                EditText editText = (EditText) findViewById(R.id.editText);
                EditText editText3 = (EditText) findViewById(R.id.editText3);
                double divisa1 = Double.valueOf(editText.getText().toString());
                double comisio = Double.valueOf(editText3.getText().toString());
                divisa1 = divisa1 - comisio/100;
                textView.setText(String.valueOf(divisa1));
            }
        });
    }
}
