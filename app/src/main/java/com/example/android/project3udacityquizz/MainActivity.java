package com.example.android.project3udacityquizz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Button button;
    Bundle bundle;
    String name;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.btnPlay);
        // Initializing EditText view
        editText = (EditText) findViewById(R.id.entertext);
        // Bundle
        bundle = new Bundle();
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                // Get the Name from EditText from main_activity.xml layout
                name = editText.getText().toString();
                bundle.putString("name", name);
				Intent intent = new Intent(MainActivity.this,
                        SecondActivity.class);
                // Pass data to SecondActivity
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }

}