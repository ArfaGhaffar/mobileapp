package com.example.unitconvertor;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button, button2 , button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            openFirst();

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openSecond();

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openThird();

            }
        });

    }

    private void openFirst() {
        Intent intent = new Intent(this,FirstConversion.class);
      startActivity(intent);
    }

    private void openSecond() {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    private void openThird() {
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }


}