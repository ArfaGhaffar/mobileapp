package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstConversion extends AppCompatActivity {
    EditText editText;
    TextView textView1,textView2,textView3,textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_conversion);




            textView1 = findViewById(R.id.textView1);
            textView2 = findViewById(R.id.textView2);
            textView3 = findViewById(R.id.textView3);
            textView4 = findViewById(R.id.textView4);
            editText=findViewById(R.id.editText);
            button = findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    ConvertFromKiloToPound();

                }
            });
    }

    private void ConvertFromKiloToPound() {
        String kilovalue = editText.getText().toString();

        double kilo = Double.parseDouble(kilovalue);

        double pounds = kilo * 2.205;

        textView4.setText("         "+ pounds);

    }
}