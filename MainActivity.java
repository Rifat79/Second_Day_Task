package com.example.mdibrahim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button myButton;
    String s = " Hi!! Welcome to my First Android Project";
    int button_clicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button)findViewById(R.id.OkButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked++;
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText("Button Clicked "+button_clicked+" times");
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
            }
        });
    }
	

    //int button_clicked = 0;
    /*public void onClick(View view) {
        button_clicked++;
        TextView text = (TextView) findViewById(R.id.textView);
        text.setText("Button Clicked "+button_clicked+" times");
    }*/

    public void onClick( View view ) {
        Intent intent = new Intent( this, Main2Activity.class );
        startActivity(intent);
    }

}
