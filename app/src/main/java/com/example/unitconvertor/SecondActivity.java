package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    TextView textView1,textView2,textView3,textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


            textView1 = findViewById(R.id.textView1);
            textView2 = findViewById(R.id.textView2);
            textView3 = findViewById(R.id.textView3);
            textView4 = findViewById(R.id.textView4);
            editText=findViewById(R.id.editText);
            button = findViewById(R.id.button);

            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    ConvertFromMeterToInch();

                }
            });
    }

    private void ConvertFromMeterToInch() {
        String metervalue = editText.getText().toString();

        double meter = Double.parseDouble(metervalue);

        double inches = meter * 39.37;

        textView4.setText("         "+ inches);

    }
}