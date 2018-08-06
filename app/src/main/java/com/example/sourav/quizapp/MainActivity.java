package com.example.sourav.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * global score variable
     */
    private int totalScore = 0;
    private int correctAnswer = 0;
    private int wrongAnswer = 0;

    /**
     * function checking question 1
     */
    public void questionOne() {
        EditText editText = findViewById(R.id.question_one);
        String value = editText.getText().toString().toUpperCase();
        if (value.equals("DENNIS RITCHIE") || value.equals("DENNIS M. RITCHIE")) {
            totalScore = totalScore + 1;
            correctAnswer = correctAnswer + 1;
        } else if (value.equals("")) {
            wrongAnswer = wrongAnswer + 1;
        } else
            wrongAnswer++;
    }

    /**
     * function checking question 2
     * question two ---> radio button handler
     */

    public void questionTwo() {
        RadioButton radioButtonOne = findViewById(R.id.rb_question_2_op1);
        RadioButton radioButtonTwo = findViewById(R.id.rb_question_2_op2);
        //option one is correct
        if (radioButtonOne.isChecked()) {
            totalScore++;
            correctAnswer++;
        } else
            wrongAnswer++;
    }

    /**
     * function checking question 3
     * question three ---> radio button handler
     */

    public void questionThree() {
        RadioButton radioButtonOne = findViewById(R.id.rb_question_3_op1);
        RadioButton radioButtonTwo = findViewById(R.id.rb_question_3_op2);
        //option two is correct
        if (radioButtonTwo.isChecked()) {
            totalScore++;
            correctAnswer++;
        } else
            wrongAnswer++;
    }

    /**
     * function checking question 4
     */
    public void questionFour() {
        EditText editText = findViewById(R.id.question_four);
        String value = editText.getText().toString().toUpperCase();
        if (value.equals("TRUE")) {
            totalScore++;
            correctAnswer++;
        } else if (value.equals("")) {
            wrongAnswer++;
        } else
            wrongAnswer++;
    }

    /**
     * function checking question 5
     * question 5 check box handler
     */
    public void questionFive() {
        CheckBox checkBoxTwo = findViewById(R.id.cb_question_5_op2);
        CheckBox checkBoxFour = findViewById(R.id.cb_question_5_op4);
        //option2 and option4 are correct
        CheckBox checkBoxOne = findViewById(R.id.cb_question_5_op1);
        CheckBox checkBoxThree = findViewById(R.id.cb_question_5_op3);
        if (!checkBoxOne.isChecked() && checkBoxTwo.isChecked() && checkBoxFour.isChecked() && !checkBoxThree.isChecked()) {
            totalScore++;
            correctAnswer++;
        } else {
            wrongAnswer++;
        }
    }

    public void questionSix() {
        CheckBox checkBoxOne = findViewById(R.id.cb_question_6_op1);
        CheckBox checkBoxFour = findViewById(R.id.cb_question_6_op4);
        //option one and four are correct
        CheckBox checkBoxTwo = findViewById(R.id.cb_question_6_op2);
        CheckBox checkBoxThree = findViewById(R.id.cb_question_6_op3);
        if (!checkBoxTwo.isChecked() && checkBoxFour.isChecked() && checkBoxOne.isChecked() && !checkBoxThree.isChecked()) {
            totalScore++;
            correctAnswer++;
        } else {
            wrongAnswer++;
        }
    }

    /**
     * function checking question 7
     * question seven ---> radio button handler
     */


    public void questionSeven() {
        RadioButton radioButtonOne = findViewById(R.id.rb_question_7_op1);
        RadioButton radioButtonTwo = findViewById(R.id.rb_question_7_op2);
        //option one is correct
        if (radioButtonOne.isChecked()) {
            totalScore++;
            correctAnswer++;
        } else
            wrongAnswer++;
    }

    /**
     * function checking question 8
     */
    public void questionEight() {
        EditText editText = findViewById(R.id.question_eight);
        String value = editText.getText().toString().toUpperCase();
        if (value.equals("JAMES GOSLING")) {
            totalScore++;
            correctAnswer++;
        } else if (value.equals("")) {
            wrongAnswer++;
        } else
            wrongAnswer++;
    }

    /**
     * submit quiz function
     * displays quiz statistics
     */
    public void submitQuiz(View view) {
        questionOne();
        questionTwo();
        questionThree();
        questionFour();
        questionFive();
        questionSix();
        questionSeven();
        questionEight();
        String messageOne = "Yay!! all answers are correct and your score:" + totalScore;
        String messageTwo = "Your score:" + totalScore + " , correct:" + correctAnswer + " , wrong:" + wrongAnswer;
        if (totalScore == 8) {
            Toast.makeText(this, messageOne, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, messageTwo, Toast.LENGTH_SHORT).show();
        }
        //resetting global variables
        totalScore = 0;
        wrongAnswer = 0;
        correctAnswer = 0;


    }
}
