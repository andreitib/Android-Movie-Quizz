package com.example.android.project3udacityquizz;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.android.project3udacityquizz.MainActivity;
import com.example.android.project3udacityquizz.R;


public class SecondActivity extends AppCompatActivity {
     Bundle bundle;
    private String name;
    @BindView(R.id.question1A_rb) RadioButton radioButtonfirstanswer;

    RadioButton
                radioButtonsecondanswer,
                radioButtonthirdanswer,
                radioButtonfourthanswer,
                radioButtonfifthanswer,
                radioButtonsixthanswer,
                radioButtonseventhanswer;
    EditText    editTexteightanswer;
    CheckBox    checkBoxninethanswer1,
                checkBoxninethanswer2,
                checkBoxninethanswer3,
                checkBoxninethanswer4;

// Setting the score to zero;
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //radioButtonfirstanswer =  findViewById(R.id.question1A_rb);
        radioButtonsecondanswer =  findViewById(R.id.question2B_rb);
        radioButtonthirdanswer =  findViewById(R.id.question3A_rb);
        radioButtonfourthanswer =  findViewById(R.id.question4B_rb);
        radioButtonfifthanswer =  findViewById(R.id.question5A_rb);
        radioButtonsixthanswer =  findViewById(R.id.question6B_rb);
        radioButtonseventhanswer =  findViewById(R.id.question7A_rb);
        editTexteightanswer =  findViewById(R.id.question8_et);
        checkBoxninethanswer1 =  findViewById(R.id.question9A_cb);
        checkBoxninethanswer2 = findViewById(R.id.question9B_cb);
        checkBoxninethanswer3 =  findViewById(R.id.question9C_cb);
        checkBoxninethanswer4 =  findViewById(R.id.question9D_cb);

        // Get Bundle
        bundle = getIntent().getExtras();
        // Extract value
        name = bundle.getString("name");
    }

    public void Submit(View V) {

        if (radioButtonfirstanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonsecondanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonthirdanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonfourthanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonfifthanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonsixthanswer.isChecked()) {
            score =score+1;
        }
        if (radioButtonseventhanswer.isChecked()) {
            score =score+1;
        }
        boolean checkboxx1=checkBoxninethanswer1.isChecked();
        boolean checkboxx2=checkBoxninethanswer2.isChecked();
        boolean checkboxx3=checkBoxninethanswer3.isChecked();
        boolean checkboxx4=checkBoxninethanswer4.isChecked();
        if(checkboxx1 && !checkboxx2  && checkboxx3  && !checkboxx4){
            score = score +1;
        }
        String answerq4 = editTexteightanswer.getText().toString();
        if (answerq4.equals("Twilight")||answerq4.equals("twilight")||answerq4.equals("TWILIGHT")) {
            score =score+1;}


        if (score == 9) {
            Toast.makeText(this, "Perfect " + name + " ! Your score is " + score + " points out of 9!", Toast.LENGTH_LONG).show();
        }else if(score == 0){
            Toast.makeText(this, "I'm sorry " + name + "! No answers out of 9 are correct!", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Well done " + name + " ! Your score is " + score + " point(s) out of 9!", Toast.LENGTH_LONG).show();
        }
        score=0;
    }
    //Get back to first screen, when the Restart button is pressed
    public void restartButton(View v){
        score = 0;
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent); }

}


